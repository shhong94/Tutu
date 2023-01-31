package com.study.home.board.entity;

/*
 * BoardDto 객체
 * 
 * DAO <-> DB 통신 등에 사용.
 * 
 * 대부분의 경우에 DB의 테이블을 따라서 만듬.
 */
public class BoardDto {
	
	
	private int id;						// 게시판 아이디
	private String content;				// 게시판 내용
	
	
	// id의 Getter, Setter 메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	// content의 Getter, Setter 메소드
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
