package com.javasm.user.aspect;


public class UserAspect {
	
	
	public void beforeMethod() {
		System.out.println("xml前置");
	}
	public void afterMethod() {
		System.out.println("xml后置");
	}
	public void afterThrowingMethod() {
		System.out.println("xml异常");
	}
	public void afterReturningMethod() {
		System.out.println("xml返回值");
	}
	
}
