package com.shop.common.controller;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shop.common.model.User;

@RestController
@RequestMapping("/common/login")
public class testcontroller {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User login() throws IOException {
		
		String resource = "conf.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		String statement = "com.shop.common.userMapper.getUser";
		User user = session.selectOne(statement,1);
		System.out.println(user);
		return user;
	}
}
