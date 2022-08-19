package com.o.project;


import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class JDECTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//JDBC 연결 정상적으로 되었는지 확인할수있음.
	@Test
	public void testConnection() {
		
		try(Connection con = 
				DriverManager.getConnection(
                // Oracle19 버전인 경우 => "jdbc:oracle:thin:@localhost:1521:orcl"
                // Oracle11 버전인 경우 => "jdbc:oracle:thin:@localhost:1521:XE"
						"jdbc:oracle:thin:@localhost:1521:XE",
						"project",
						"a")){
			System.out.println(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	
}
