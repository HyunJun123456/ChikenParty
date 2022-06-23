package com.test.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.BoardDto;
import com.test.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	 
	//전체공지사항 조회 리스트
	@RequestMapping("/boardList")
	public String getBoardList(Model model) {
		model.addAttribute("boardDto",boardService.getBoardList());
		return "boardList";
	} 
	
	//공지사항 디테일 조회
	@GetMapping("/boardDetail")
	public String getBoardDetail(Model model, int boardSeq) {
		model.addAttribute("boardDto",boardService.getBoardDetail(boardSeq));
		return "boardDetail";
	}
	
	//공지사항 글쓰기폼
	@RequestMapping("/insertBoardForm")
	public String insertBoardForm() {
		return "insertBoard";
	}
	
	//공지사항 글쓰기
	@PostMapping("/insertBoard")
	public String insertBoard(BoardDto boardDto) {
		System.out.println("인설트 보드");
		System.out.println(boardDto.toString());
		int res= boardService.insertBoard(boardDto);
		if(res>0) {
			return "redirect:boardList?userId="+boardDto.getUserId();
		}else {
			return "insertBoardForm";
		}
	}
	
	//공지사항 글수정폼
	@RequestMapping("/updateBoardForm")
	public String updateBoardForm(Model model,int boardSeq) {
		System.out.println("글수정폼");
		model.addAttribute("dto",boardService.getBoardDetail(boardSeq));
		return "updateBoard";
	}
	
	//공지사항 글수정
	@PostMapping("/updateBoard")
	public String updateBoard(BoardDto boardDto) {
		System.out.println("ewfwelkjfwl");
		System.out.println(boardDto.toString());
		int res=boardService.updatetBoard(boardDto);
		if(res>0) {
			return "redirect:boardList";
		}else{
			return "redirect:updateBoardForm?board_seq="+boardDto.getBoardSeq();
		}
	}
	
	//공지사항 삭제
	@RequestMapping("deleteBoard")
	public String deleteBoard(int boardSeq,BoardDto boardDto) {
		int res=boardService.deletetBoard(boardSeq);
		if(res>0) {
			return "redirect:boardList?userId="+boardDto.getUserId();
		}else {
			return "redirect:boardDetail?board_seq="+boardSeq+"&userId="+boardDto.getUserId();
		}
	}
	

}
