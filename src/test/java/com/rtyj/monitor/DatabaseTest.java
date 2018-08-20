package com.rtyj.monitor;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by angel on 2017/12/6.
 * 数据库连接的测试
 */
public class DatabaseTest {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-integration.xml");
        BasicDataSource data = (BasicDataSource) ctx.getBean("mysql");
        System.out.println(data.getUsername());
    }
}
