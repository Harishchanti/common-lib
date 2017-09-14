package com.ailiens.common;

import com.codahale.metrics.Timer;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {

	@Autowired(required=false)
	TimerTask timerTask;

    @PersistenceContext
    EntityManager em;

	@Before("@annotation(com.ailiens.common.CustomTimed) ,name={param} ")
	public void processTimer(ProceedingJoinPoint pjp) throws Throwable {


	    String methodName = pjp.getSignature().getName();

        em.lock(client, LockModeType.PESSIMISTIC_WRITE);

		Timer.Context context = CustomMetricsReporter.startTimer(methodName);

		if(timerTask!=null) {
			timerTask.proceed(context,pjp);
		}else {
			pjp.proceed();
			context.stop();
		}

	}
}
