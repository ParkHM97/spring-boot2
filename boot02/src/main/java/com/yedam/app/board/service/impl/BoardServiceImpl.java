package com.yedam.app.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.board.mapper.BoardMapper;
import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

@Service // Bean 등록 => @Transcational
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper boardMapper;
	
	@Autowired // 생성자 주입 방식
		public BoardServiceImpl(BoardMapper boardMapper){// Board 테이블에 접근하는 Mapper (DB가 필요할 경우 있어야 하는 구문(필요 Mapper 등록))
		this.boardMapper = boardMapper;
	}
	
	@Override 	// 현재 게시판의 전체 글 조회
	public List<BoardVO> findBoardList() {
		return boardMapper.selectAllList(); // Select문 실행 
	}
	
	@Override
	public BoardVO findBoardByBno(BoardVO boardVO) {
		return boardMapper.selectInfo(boardVO);
	}
}
