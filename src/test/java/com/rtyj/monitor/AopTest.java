package com.rtyj.monitor;

import com.rtyj.monitor.bean.Student;
import com.rtyj.monitor.bean.User;
import com.rtyj.monitor.log.LogService;
import com.rtyj.monitor.security.CurrentUserHolder;
import com.rtyj.monitor.service.StuInheritService;
import com.rtyj.monitor.service.StudentService;
import com.rtyj.monitor.service.UService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by angel on 2018/5/11.
 */
public class AopTest {

    public static void main(String[] args) throws Exception{
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[]{
           "classpath:spring-bean.xml"
        });
        /*UService uService = (UService) context.getBean("uService");
        CurrentUserHolder.set("admin");
        uService.addUser(new User());*/

        /*LogService service = (LogService) context.getBean("studentService");
        service.startLog();*/

        StuInheritService service = (StuInheritService) context.getBean("stuInheritService");
        String st = service.addStudentInfo("productId");
        System.out.println("结果是："+st);
    }
}
