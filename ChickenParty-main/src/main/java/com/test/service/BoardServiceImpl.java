package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.BoardDto;
import com.test.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardDto> getBoardList() {
		return boardMapper.getBoardList();
	}

	@Override
	public BoardDto getBoardDetail(int board_seq) {
		return boardMapper.getBoardDetail(board_seq);
	}

	@Override
	public int insertBoard(BoardDto boardDto) {
		return boardMapper.insertBoard(boardDto);
	}

	@Override
	public int updatetBoard(BoardDto boardDto) {
		return boardMapper.updatetBoard(boardDto);
	}

	@Override
	public int deletetBoard(int board_seq) {
		return boardMapper.deletetBoard(board_seq);
	}

	

}
