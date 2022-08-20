package com.o.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.o.model.UserVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class UserMapperTest {

	@Autowired
	private UserMapper usermapper; // userMapper.java 인터페이스 의존성 주입

	// 유저 회원가입 테스트
	@Test
	public void usersignup() throws Exception {
		UserVO a = new UserVO();
			a.setUserId("test");
			a.setUserPwd("test");
			a.setUserName("test");
			a.setUserEmail("test");
			a.setUserAddr1("test");
			a.setUserAddr2("test");
			a.setUserAddr3("test");
			a.setMoney("0");
			a.setPoint("0");

		usermapper.userinfo(a); // 쿼리 메서드 실행

	}

}
