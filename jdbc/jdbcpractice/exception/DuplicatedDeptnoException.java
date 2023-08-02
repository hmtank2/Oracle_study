package com.exception;


//사용자정의 예외클래스 --> 만들어져 있는게 다가 아니고 우리만의 익셉션
public class DuplicatedDeptnoException extends Exception{
//그래서 결과저긍로 서벌때였나.
	
	//필요시 변수 메소드 추가 가능
	public DuplicatedDeptnoException(String message) {
		super(message);
		
	}
	
}
