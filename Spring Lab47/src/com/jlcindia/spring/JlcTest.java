package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={JlcConfig.class})
public class JlcTest {
	@Autowired
	private Student stud;
	public void testStudent(){
		String msg=stud.getMessage();
		//assertEquals("Hello Sri",msg);
	}
}
