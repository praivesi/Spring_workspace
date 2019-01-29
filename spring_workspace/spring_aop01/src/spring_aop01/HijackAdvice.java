package spring_aop01;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 메인 업무 호출 되기 전에 Hijack을 실행하고 싶음
public class HijackAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("공통 관심사 업무 지정");
		System.out.println("메인 업무(method) 가 실행되기 전에 가로채기");
		
	}
}
