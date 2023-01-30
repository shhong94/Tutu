package com.study.home;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.home.board.model.BoardDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardDao dao;
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory factory;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("Å×½ºÆ®");
		
		
		String test = dao.testSql();
		System.out.println(test);
		
//		Connection connection = dataSource.getConnection();
//		DatabaseMetaData metaData = connection.getMetaData();
//		System.out.println("¡ß User: " + metaData.getUserName());
//		System.out.println("¡ß URL: " + metaData.getURL());
		
//		SqlSession sqlSession = factory.openSession();
//		String test = sqlSession.selectOne("com.study.home.TestMapper.test");
//		System.out.println(test);
		
		
		
		return "home";
	}
	
}
