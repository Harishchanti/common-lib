package com.ailiens.common;

import org.aspectj.lang.ProceedingJoinPoint;

import com.codahale.metrics.Timer;

public interface CustomInterface {

	void proceed(Timer.Context context, ProceedingJoinPoint pjp) throws Throwable;

}
