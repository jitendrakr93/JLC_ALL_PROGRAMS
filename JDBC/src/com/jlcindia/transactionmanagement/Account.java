package com.jlcindia.transactionmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jlcindia.jdbc.util.JDBCUtil;

public class Account {
	int bal;
	int dabal,sabal,danbal,sanbal;
	public void transfer(int sa,int da,int amt){
		Connection con=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			
			//Starting Transaction
			con.setAutoCommit(false);
			
			//Operation 1 check destination account
			ps1=con.prepareStatement("select bal from account where accno=?");
			ps1.setInt(1, da);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()){
				dabal=rs1.getInt(1);
			}else{
				throw new InvalidAccountNumberEXception(da);
			}
			danbal=dabal+amt;
			
			//Operation 2 Updating Destination Account
			ps2=con.prepareStatement("update account set bal=? where accno=?");
			ps2.setInt(1, danbal);
			ps2.setInt(2, da);
			ps2.executeUpdate();
			System.out.println("**"+da+" updated");
			
			//Operation 3 Checking source account
			ps1.setInt(1, sa);
			rs1=ps1.executeQuery();
			if(rs1.next()){
				sabal=rs1.getInt(1);
			}else{
				throw new InvalidAccountNumberEXception(sa);
			}
			if(sabal>=amt){
				sanbal=sabal-amt;
			}else{
				throw new InsufficientFundsException();
			}
			
			//Operation 4 Updating Source Account
			ps2.setInt(1, sanbal);
			ps2.setInt(2, sa);
			ps2.executeUpdate();
			con.commit();
			System.out.println("** "+sa+" updated");
			System.out.println("** Fund Transfered");
		}catch(Exception e){
			System.out.println(e);
			try{
				con.rollback();
			}catch(Exception e1){}
		}finally {
			JDBCUtil.cleanUp(ps1, con);
			JDBCUtil.cleanUp(ps2, con);
		}
	}
}
