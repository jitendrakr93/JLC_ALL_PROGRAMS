package com.jlcindia.spring.mvc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
@RequestMapping(value="/uploadfile.jlc",method=RequestMethod.POST)
public String uploadFile(@RequestParam("name")String name,@RequestParam("file")MultipartFile[] files,HttpServletRequest req){
	for(MultipartFile file : files){
		if(file.isEmpty()){
			req.setAttribute("MSG", file.getOriginalFilename()+ "is empty");
			return "error";
		}else{
			try{
				byte data[]=file.getBytes();
				File dir=new File("E:/files");
				if(!dir.exists())
					dir.mkdirs();
				File f=new File(dir,file.getOriginalFilename());
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(f));
				stream.write(data);
				stream.close();
			}catch(Exception e){
				e.printStackTrace();
				req.setAttribute("MSG", file.getOriginalFilename()+"."+e.getMessage());
				return "error";
			}
		}
	}
	req.setAttribute("MSG", "E:/files");
	return "success";
}
}
