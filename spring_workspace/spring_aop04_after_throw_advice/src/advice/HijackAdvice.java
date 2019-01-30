package advice;

import org.springframework.aop.ThrowsAdvice;

public class HijackAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("--------------------------");
		System.out.println(e.getMessage());
		System.out.println("Hijack advice");
	}

}
