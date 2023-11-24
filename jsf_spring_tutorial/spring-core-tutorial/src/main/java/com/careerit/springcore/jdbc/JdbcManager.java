package com.careerit.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.springcore.jdbc")
public class JdbcManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcManager.class);
        PlayerDao playerDao = context.getBean(PlayerDao.class);
        System.out.println(playerDao.countOfPlayers());
    }
}
