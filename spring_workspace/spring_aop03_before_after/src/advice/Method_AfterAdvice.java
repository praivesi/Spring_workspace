package advice;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class Method_AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	
		// OS에 파일로 저장
		// C:\log\오늘날짜.txt
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDD");
		
		String fileName = sdf.format(d);
		
		// 디렉토리 생성
		String dir = "C:\\log";
		
		File f = new File(dir);
		
		// 폴더가 존재하지 않으면 생성
		if(!f.exists()) {
			f.mkdirs();
		}
		
		File f2 = new File(dir + "\\" + fileName + ".txt");
		
		// 파일이 존재하지 않으면 생성
		if(!f2.exists()) {
			f2.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f2);
		
		pw.println(fileName + ".log 저장합니다.");
		pw.println(args[0] + " 원 이체되었습니다.");
		pw.flush();
		pw.close();
		
		// 이렇게 기록을 남겨 놓으면 ---> 감사 자료가 됨.
		
		
		// 매개변수 출력
	/*	System.out.println("returnVAlue : " + returnValue);
		System.out.println("method : " + method.getName());
		System.out.println("args : " + args[0]);
		System.out.println("targe :  " + target.getClass().getName());*/
	}

}












