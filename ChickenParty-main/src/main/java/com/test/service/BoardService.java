package com.test.service;

import java.util.List;

import com.test.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> getBoardList();
	public BoardDto getBoardDetail(int board_seq);
	public int insertBoard(BoardDto boardDto);
	public int updatetBoard(BoardDto boardDto);
	public int deletetBoard(int board_seq);
}
