package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj1 = (Alien) context.getBean("alien1");
 //   	obj1.setAge(5);
    	obj1.code();
    	System.out.println(obj1.getAge());
    	
    	Desktop obj2 = context.getBean(Desktop.class);
    	
 //   	Alien obj2 = (Alien) context.getBean("alien1");
//    	obj2.code();
//    	System.out.println(obj2.age);
    }
}
