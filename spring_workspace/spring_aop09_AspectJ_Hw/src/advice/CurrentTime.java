package advice;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CurrentTime {
	
	@Pointcut("execution (public * fire()) ")
	public void publicTarget() {}
	
	@AfterReturning("publicTarget()")
	public Object logAfter(JoinPoint jp) throws Throwable
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd HH:mm:ss");
		
		// ProceedingJointPoint 는 Around 에서만 사용
		
		Object obj = ((ProceedingJoinPoint)jp).proceed();
		
		String useTime = sdf.format(d);
		
		File f = new File("C:\\log\\aopannotation.txt");
		if(!f.exists()) f.createNewFile();
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("무기 사용 시각 : " + useTime);
		pw.flush();
		pw.close();
		
		
		return obj;
	}

}
