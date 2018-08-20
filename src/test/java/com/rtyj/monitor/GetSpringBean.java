package com.rtyj.monitor;

import com.rtyj.monitor.resource.UserResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lsy on 2017/12/5.
 */
public class GetSpringBean {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
        UserResource user = (UserResource) ctx.getBean("userServiceImpl");
    }
}
