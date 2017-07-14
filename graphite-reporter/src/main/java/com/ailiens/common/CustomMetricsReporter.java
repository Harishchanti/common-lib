package com.ailiens.common;

import static com.codahale.metrics.MetricRegistry.name;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

@Component
public class CustomMetricsReporter {

    static MetricRegistry metricRegistry;

    static Map<String,Timer> timerMap = new ConcurrentHashMap<>();


    @Autowired
    public CustomMetricsReporter(MetricRegistry metricRegistry) {
		this.metricRegistry = metricRegistry;
	}


	private static Timer getTimer(String key) {
		
        if(timerMap.containsKey(key))return timerMap.get(key);
        Timer timer = metricRegistry.timer(name(CustomMetricsReporter.class, key));
        timerMap.put(key,timer);
        return timer;
    }
	
	public static Timer.Context startTimer() {
		Timer timer= getTimer(Thread.currentThread().getStackTrace()[2].getMethodName());

		Timer.Context context= timer.time();
		return context;
	}

	public static Timer.Context startTimer(String functionName) {
		Timer timer= getTimer(functionName);

		Timer.Context context= timer.time();
		return context;
	}

	
}
