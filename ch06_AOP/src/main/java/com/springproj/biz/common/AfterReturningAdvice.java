package com.springproj.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springproj.biz.board.BoardVO;



public class AfterReturningAdvice { //메서드가 동작이 완료 된 후 실행

	public void afterLog(JoinPoint jp, Object returnObj) {
	String method =	jp.getSignature().getName();
			
	
	if(returnObj instanceof BoardVO) {
		
		BoardVO board = (BoardVO)returnObj;
		
		if((board.getWriter()).equals("홍길동")) {
			
			System.out.println("홍길동님 이군요.");
		}
		
		
	}
	
	System.out.println("[정상 종료] "+method+" 비즈니스 로직 수행 후 동작.");
	
	
	}
	
}
