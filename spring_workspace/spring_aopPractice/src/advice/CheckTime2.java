package advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime2 {

	public Object logAround(ProceedingJoinPoint pjp) throws Throwable{
		
		// 메소드 이름 체크
		String methodName = pjp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("methodName : " + methodName);
		System.out.println("수행 시간 : " + sw.getTotalTimeSeconds());
		
		return obj;
	}

}
