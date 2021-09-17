package com.iu.s4.board.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import com.iu.s4.board.BoardFileDTO;

@Component
public class FileDown extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// model -> Controller의 Model
		
		//폴더명
		String board = (String) model.get("board");
		//realPath
		String realPath = request.getSession().getServletContext().getRealPath("/resources/upload/" + board);
		
		//파일네임
		BoardFileDTO boardFileDTO = (BoardFileDTO) model.get("dto");
		
		File file = new File(realPath, boardFileDTO.getFileName());
		
		
		//한글처리
		response.setCharacterEncoding("UTF-8");
		
		//파일 크기
		response.setContentLength((int) file.length());
		
		//다운로드 시 파일 이름 인코딩
		String fileName = boardFileDTO.getFileName();
		String downName = fileName.substring(fileName.lastIndexOf("_")+1);
//		String downName = URLEncoder.encode(boardFileDTO.getOriName(), "UTF-8");
		
		//response header 설정
		response.setHeader("Content-Disposition", "attachment;fileName=\""+downName+"\"");
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		//파일 읽어서 Client에 전송
		FileInputStream fi = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		
		FileCopyUtils.copy(fi, os);
		
		
		//자원 해제
		os.close();
		fi.close();


	}

	
	
}
