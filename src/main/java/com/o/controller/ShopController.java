package com.o.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopController {
	private static final Logger logger=LoggerFactory.getLogger(ShopController.class);

	//메인 페이지 이동
		@RequestMapping(value = "/main", method = RequestMethod.GET)
		public void mainPageGET() {
			
			logger.info("메인 페이지 진입");
			
		}
	
}
5