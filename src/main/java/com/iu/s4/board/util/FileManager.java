package com.iu.s4.board.util;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	//파일 삭제
	public void fileDelete(File file) throws Exception {

	}
	
	
	//fileSave
	//realPath: 폴더
	//files: 파일
	public String fileSave(MultipartFile multipartFile, File file) throws Exception {
		
		if (!file.exists()) {
			file.mkdirs();
		}
		
		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + multipartFile.getOriginalFilename();
		
		file = new File(file, fileName);
		
		//저장
//		FileCopyUtils.copy(multipartFile.getBytes(), file);
		multipartFile.transferTo(file);
		
		//db에 저장하기 위해 fileName return
		return fileName;
	}
	
	
}
