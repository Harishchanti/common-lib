package com.ailiens.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codahale.metrics.Timer;

@Aspect
@Component
public class TimerAspect {
	
	@Autowired(required=false)
	TimerTask timerTask;

	@Around("@annotation(com.ailiens.common.CustomTimed)")
	public void processTimer(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		Timer.Context context = CustomMetricsReporter.startTimer(methodName);
		
		if(timerTask!=null) {
			timerTask.proceed(context,pjp);
		}else {
			pjp.proceed();		
			context.stop();
		}
		
	}
}
