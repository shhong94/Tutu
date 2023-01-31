package com.study.home.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.home.board.entity.BoardDto;
import com.study.home.board.model.BoardDao;

@Controller
public class BoardController {

	@Autowired
	BoardDao dao;							// BoardDao 의존성 주입 (BoardDao의 인스턴스를 스프링이 자동 생성)
	
	@RequestMapping("/selectListBoard")
	public String selectListBoard(Model model) throws Exception {
		
		List<BoardDto> boardList = dao.selectListBoard();		// dao를 사용하여 boardList 가져오기
		
		
		model.addAttribute("boardList", boardList);				// Model에 boardList 담기	(※ Model: 컨트롤러가 JSP에 파라미터를 보낼 때 필요한 바구니)
		
		
		return "/board/boardList";								// /board/boardList.jsp로 이동
	}
}
