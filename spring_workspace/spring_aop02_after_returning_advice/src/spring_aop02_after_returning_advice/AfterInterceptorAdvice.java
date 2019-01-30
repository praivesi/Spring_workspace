package spring_aop02_after_returning_advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterInterceptorAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("-------------------------------");
		System.out.println("target method 가 호출된 후에");
		System.out.println("실행되는 advice method");
		System.out.println("-------------------------------");
	}
}
