package com.study.home.board.model;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	
	private static final String namespace = "com.study.home.TestMapper";
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public String testSql() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		return sqlSession.selectOne(namespace + "." + "test");
	}

}
