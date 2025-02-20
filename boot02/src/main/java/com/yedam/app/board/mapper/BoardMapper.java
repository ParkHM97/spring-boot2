package com.yedam.app.board.mapper;

import java.util.List;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	// 전체조회 (리턴 타입 List)
	public List<BoardVO> selectAllList();
	
	// 단건조회 (리턴타입 BoardVO)
	public BoardVO selectInfo(BoardVO boardVO);
	
	// 등록
	
	// 수정 
	
	// 삭제
}
