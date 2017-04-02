package com.nitro.Config;


import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@Configuration
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        event.getSession().setMaxInactiveInterval(30);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
    }
}