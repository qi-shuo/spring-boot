package com.qis.springbootmytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qishuo
 * @date 2021/3/5 12:45 上午
 */
@RestController()
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/test")
	private String demoController(String name) {
		System.out.println("测试spring源码构建");
		return name;
	}
}
