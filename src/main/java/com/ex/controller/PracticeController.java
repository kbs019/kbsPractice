package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice/*")	// 요청URI 가 /practice/* 로 이루어진다면, 해당하는 uri 에 해당하는 메서드를 호출하여 뷰 페이지로 이동한다.
public class PracticeController {
	
	@GetMapping("test01")	// 요청 URI 가 /practice/test01 이라면 test01() 를 실행시켜 
	public String test01() {
		return "/practice/test01";	// 리턴값인 test01.html 의 뷰 페이지로 이동한다.
	}
	
	@GetMapping("test02")
	public String test02( Model model ) {
		model.addAttribute("massage", "hello");
		
		return "/practice/test02";
	}
}

/*
	1. templates 는 폴더인가 패키지인가?
		- resources/templates 는 리소스를 담는 물리적 경로로 패키지 개념이 적용되지 않는다.
		- 뷰 템플릿 엔진(타임리프 등)이 .html 을 찾는 디렉토리(폴더)일 뿐 패키지와는 무관하다.
		
	2. templates 폴더 내부에 기능별로 하위 디렉토리를 생성하여 많은 .html 파일을 관리해준다.
		- templates/board | templates/member 와 같이 하위 폴더를 생성하여 .html 뷰 파일을 관리한다.
		
	3. application.properties 파일은 무슨 역할을 하는가?
		- Spring Boot 애플리케이션의 설정 파일로 다양한 설정을 여기서 작성할 수 있다.
		- 예를 들어 // 서버 포트 변경, 데이터베이스 연결 정보, 타임리프 캐시 설정 등
		
		
	4. Application.java 파일은 무엇인가?
		- @SpringBootApplication 이 선언된 메인 클래스로
		- 프로젝트의 진입점(Entry point)이자 스프링 컨테이너를 초기화하는 역할을 한다.
		- 이 파일은 특별한 이유가 없는 한 건드릴 필요도 없고, 건드려서도 안되는 파일이다.
			-- 잘못 수정하면 스트링 부트 애플리케이션이 구동 자체를 못 할 수 있다.
	
*/