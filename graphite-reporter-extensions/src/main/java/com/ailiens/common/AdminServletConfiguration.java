package com.ailiens.common;

import com.codahale.metrics.servlets.AdminServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jayant on 1/1/17.
 */
@Configuration
public class AdminServletConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean()
  {
      return new ServletRegistrationBean(new AdminServlet(),"/admin/*");
  }
}
