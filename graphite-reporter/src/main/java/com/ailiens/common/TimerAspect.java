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
	CustomInterface customInterface;

	@Around("@annotation(com.ailiens.common.PrivateTimed)")
	public void processTimer(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		Timer.Context context = CustomMetricsReporter.startTimer(methodName);
		
		if(customInterface!=null) customInterface.proceed(context,pjp);
		
		else {
			pjp.proceed();		
			context.stop();
		}
		
	}
}
