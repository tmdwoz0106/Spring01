package co.kr.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	public BoardMapper mapper;
	
	@Override
	public int cnt() {
		return mapper.cnt();
	}

}
