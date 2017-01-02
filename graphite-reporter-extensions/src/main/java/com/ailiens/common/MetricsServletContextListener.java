package com.ailiens.common;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.servlets.MetricsServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;

/**
 * Created by jayant on 1/1/17.
 */

@WebListener
@Component
public class MetricsServletContextListener extends MetricsServlet.ContextListener {

    @Autowired
    MetricRegistry metricRegistry;

    protected MetricRegistry getMetricRegistry() {
        return metricRegistry;
    }
}
