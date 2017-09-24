package com.donglam.webhoconline.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

@Controller
@RequestMapping("/files")
public class FilesController {

	Logger logger = org.apache.log4j.Logger.getLogger(FilesController.class);

	@Value(value = "${ckeditor.storage.image.path}")
	private String ckeditorStorageImagePath;

	@Value(value = "${ckeditor.access.image.url}")
	private String ckeditorAccessImageUrl;

	@RequestMapping(value = "/upload/image", method = RequestMethod.POST)
	@ResponseBody
	public String uploadImage(@RequestParam("upload") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
		String name = "";
		if (!file.isEmpty()) {
			try {
				response.setContentType("text/html; charset=UTF-8");
				response.setHeader("Cache-Control", "no-cache");				
				//Refused to display 'http://localhost:8080/upload/mgmt/img?CKEditor=practice_content&CKEditorFuncNum=1&langCode=zh-cn' in a frame because it set 'X-Frame-Options' to 'DENY'.
				response.setHeader("X-Frame-Options", "SAMEORIGIN");
				PrintWriter out = response.getWriter();

				String fileClientName = file.getOriginalFilename();
				String rootFilePath=ckeditorStorageImagePath+"\\images\\";

				File rootFile=new File(rootFilePath);
				if (!rootFile.exists()){
					rootFile.mkdir();
				}

				String pathName = rootFile +File.separator+ fileClientName;
				File newfile = new File(pathName);
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(newfile));
				stream.write(bytes);
				stream.close();

				// Tập hợp url trả về để cho phép ckeditor xác định vị trí hình ảnh
				String fileUrl = ckeditorAccessImageUrl +"/public/image/images/"+ File.separator + newfile.getName();

				// Trả lại url của hình ảnh được tải lên ckeditor
				String callback = request.getParameter("CKEditorFuncNum");
				String script = "<script type=\"text/javascript\">window.parent.CKEDITOR.tools.callFunction(" + callback + ", '" + fileUrl + "');</script>";

				out.println(script);
				out.flush();
				out.close();
			} catch (Exception e) {
				logger.info("You failed to upload " + name + " => " + e.getMessage());
			}
		} else {
			logger.info("You failed to upload " + name + " because the file was empty.");
		}
		return "SUCCESS";
	}
}
