package com.ailiens.common;

import com.codahale.metrics.Counter;
import com.codahale.metrics.MetricRegistry;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.codahale.metrics.MetricRegistry.name;

/**
 * Created by jayant on 22/12/16.
 */

@Component
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomReporter {

    @Autowired
    MetricRegistry metricRegistry;


    Map<String,Counter> countReporterMap = new HashMap();


     private void addReporter(String key)
     {
         Counter counter = metricRegistry.counter(name(CustomReporter.class, key));
         countReporterMap.put(key,counter);
     }

     public void checkReporter(String key)
     {
         if(!countReporterMap.containsKey(key))
             addReporter(key);
     }

    public void incCount(String key,long count)
    {
        checkReporter(key);
        countReporterMap.get(key).inc(count);
    }

    public void decCount(String key,long count)
    {
        checkReporter(key);
        countReporterMap.get(key).dec(count);
    }



}
