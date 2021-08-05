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
	@RequestMapping(value = "/uploadfile.jlc", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file,
			HttpServletRequest req) {
		String ret = "";
		if (file.isEmpty()) {
			req.setAttribute("MSG", file.getOriginalFilename() + " is empty");
			ret = "error";
		} else {
			try {
				File dir = new File("E:/files");
				if (!dir.exists()) {
					dir.mkdirs();
					String fileName = file.getOriginalFilename();
					File f = new File(dir, fileName);
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(f));
					byte data[] = file.getBytes();
					stream.write(data);
					stream.close();
					req.setAttribute("MSG", f.getAbsolutePath());
					ret = "success";
				}
			} catch (Exception e) {
				e.printStackTrace();
				req.setAttribute("MSG", file.getOriginalFilename() + "." + e.getMessage());
				ret = "error";
			}

		}
		return ret;
	}
}
