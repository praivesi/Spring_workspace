package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Method_BeforeAdvice implements MethodBeforeAdvice{

	
	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("로그인 했다 치고...");
		System.out.println("----------------------------");
		System.out.println("타갯 메소드 실행 전에 호출된 공통 관심사 (advice) 출력");
		System.out.println("----------------------------");
		
	}

}
