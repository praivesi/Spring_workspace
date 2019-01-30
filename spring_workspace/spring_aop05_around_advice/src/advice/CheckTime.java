package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		/*// 지금 시각 구하기
		long before = System.currentTimeMillis();
		
		// 수행 시간을 체크해볼 것이므로 메소드 실행 후 한번 더 시간을 구하기
		
		long after = System.currentTimeMillis();
		
		// after - before 하면 메소드 수행 시간을 구할 수 있음
		
*/		
		// 이런 작업을 의외로 많이 사용하므로 객체로 만들어 놨음
		StopWatch sw = new StopWatch(); 
		
		// 현재 시각 구하기
		sw.start();
		
		// 메소드 실행
		Object obj = invocation.proceed();
		
		// 메소드 멈춘 시간
		sw.stop();
		
		System.out.println("처리 시간 : " + sw.getTotalTimeSeconds());
		
		return obj;
	}

}
