package com.example.paymentintegration.bootstrap;

import com.example.paymentintegration.service.PaymentService;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BootstrapServletContextListener implements ServletContextListener {

    @Inject
    private PaymentService paymentService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
