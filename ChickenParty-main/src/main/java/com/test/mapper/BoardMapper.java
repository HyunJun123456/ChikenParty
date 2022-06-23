package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.dto.BoardDto;

@Mapper
public interface BoardMapper {
	@Select("SELECT boardSeq, boardTitle, boardDate FROM board ") 
	List<BoardDto> getBoardList();
	
	
	@Select(" SELECT * FROM board WHERE boardSeq= #{boardSeq} ")
	BoardDto getBoardDetail(int boardSeq);
	
	@Insert(" INSERT INTO board VALUES( null, #{boardTitle}, #{boardContent}, now(),'admin') ")
	int insertBoard(BoardDto dto);

	@Update(" UPDATE board SET boardTitle= #{boardTitle}, boardContent=#{boardContent} where boardSeq=#{boardSeq}")
	int updatetBoard(BoardDto dto);

	@Delete(" DELETE FROM board WHERE boardSeq= #{boardSeq} ")
	int deletetBoard(int boardSeq);
	
}
