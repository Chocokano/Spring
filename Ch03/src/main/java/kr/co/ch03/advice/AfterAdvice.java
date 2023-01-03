package kr.co.ch03.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}

	@After("insertPointcut()")
	public void After1() {
		System.out.println("횡단관심 - After1...");
	}
	
	public void After2() {
		System.out.println("횡단관심 - After2...");
	}
	
	public void After3() {
		System.out.println("횡단관심 - After3...");
	}
	
}
