package com.study.home.board.model;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.home.board.entity.BoardDto;


/*
 * BoardDao
 * 
 * DB에 접근하는 역할.
 * SqlSession을 사용하여 DB에 접근, SQL문 실행.
 */

@Repository
public class BoardDao {

	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;								// SqlSessionFactory 의존성 주입 (SqlSessionFactory의 인스턴스를 스프링이 자동 생성)
	

	private static final String namespace = "com.study.home.mapper_board";		// mapper_board 네임스페이스 (static: 클래스변수 / final: 상수)

	
	

	// 게시판 리스트 조회 메소드
	public List<BoardDto> selectListBoard() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();				// sqlSessionFactory를 사용하여 SqlSession 인스턴스 생성
		
		List<BoardDto> boardList = sqlSession.selectList(namespace + "." + "selectListBoard");		// SqlSession을 사용하여 selectListBoard SQL문 실행
		
		return boardList;
		
	}
	
	
	
	// 게시글 생성 메소드
	public void insertBoard(BoardDto dto) throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();				// sqlSessionFactory를 사용하여 SqlSession 인스턴스 생성
		
		sqlSession.insert(namespace + "." + "insertBoard", dto);				// SqlSession을 사용하여 insertBoard SQL문 실행 (파라미터로 BoardDto 보냄)
		
		// INSERT문은 별도의 리턴값 없음.
		
	}
	
	

}
