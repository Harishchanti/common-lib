package com.ailiens.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.inject.Singleton;
import java.util.Properties;

/**
 * Created by jayant on 20/1/17.
 */
@Configuration
public class MailSenderAutoConfig {

    @Autowired
    MailConfiguration mailConfiguration;


    @Bean
    @Singleton
    public JavaMailSenderImpl javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        Properties mailProperties = mailSender.getJavaMailProperties();
        mailProperties.put("mail.transport.protocol", "smtp");
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.starttls.enable", "true");
        mailSender.setJavaMailProperties(mailProperties);
        mailSender.setHost(mailConfiguration.getHost());
        mailSender.setPort(mailConfiguration.getPort());
        mailSender.setProtocol(mailConfiguration.getProtocol());
        mailSender.setUsername(mailConfiguration.getUsername());
        mailSender.setPassword(mailConfiguration.getPassword());
        return mailSender;
    }

    @Bean(name = "customGson")
    @Singleton
    public Gson getGson()
    {
        return new GsonBuilder().setPrettyPrinting().create() ;
    }
}

