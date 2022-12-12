package com.susu.spring.ioc;

import com.susu.spring.bean.School;
import com.susu.spring.bean.Student;
import com.susu.spring.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class ApplicationContextTest {

    private static final String CONFIG_LOCATION = "classpath:spring.xml";

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        School school = context.getBean("school", School.class);
        System.out.println(school);

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
