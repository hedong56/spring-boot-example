package com.example.demo.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.Result;

@Controller
@RequestMapping("/api/")
public class FileController {
	
	private static final Logger logger=LoggerFactory.getLogger(FileController.class);
	
	@RequestMapping("loggin")
	public Object loggin() {
		//返回文件名
		return "loggin";
	}
	
	@RequestMapping("upload")
	@ResponseBody
	public Result upload(@RequestParam(name="uploadFile") MultipartFile multipartFile,@RequestParam(name="name")String name) {
		String saveFolder="F:/tmp_dir";
		try {
			File saveDir = new File(saveFolder);
			if(!saveDir.exists()) {
				saveDir.mkdirs();
			}
		} catch (Exception e) {
			logger.error("获得项目路径异常", e);
		}
		
		try {
			if(!multipartFile.isEmpty()) {
				String fileName=multipartFile.getOriginalFilename();
				String newFileName=saveFolder+File.separator+fileName;
				File newFile=new File(newFileName);
				multipartFile.transferTo(newFile);
				logger.info("name={}", name);
				return new Result("S", "上传成功", fileName);
			}
			return new Result("S", "上传成功", "空文件");
		} catch (IOException e) {
			logger.error("文件上传异常", e);
		}
		return new Result("F", "失败", "");
	}

}
