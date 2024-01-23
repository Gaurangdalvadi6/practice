package com.javaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    		
    		Alien obj1 = context.getBean(Alien.class);
//    		obj1.setAge(5);
    		System.out.println(obj1.getAge());
        	obj1.code();
    		
//    		Desktop dt = context.getBean("desktop",Desktop.class);
//    		dt.compile();
//    		
//    		Desktop dt1 = context.getBean("desktop",Desktop.class);
//    		dt.compile();
    		
    }
}
