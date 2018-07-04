package com.spring.xml.conf.web;


import com.spring.xml.conf.robots.ModelT1000;
import com.spring.xml.conf.robots.ModelT1000const;
import com.spring.xml.conf.robots.ModelT1000getset;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainController {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Object t1000const = ctx.getBean("t1000const");
/*

        if(t1000const instanceof ModelT1000const){
            ModelT1000const t1000 = (ModelT1000const) ctx.getBean("t1000const");
            t1000.createRobot();
            t1000.dance();
            System.out.println("\n");
        }

        Object t1000getset = ctx.getBean("t1000getset");

        if(t1000getset instanceof ModelT1000getset){
            ModelT1000getset t1000 = (ModelT1000getset) ctx.getBean("t1000getset");
            t1000.createRobot();
            t1000.dance();
            System.out.println("\n");
        }
*/

        Object t1000simpl = ctx.getBean("t1000");

        if(t1000simpl instanceof ModelT1000){
            ModelT1000 t1000 = (ModelT1000) ctx.getBean("t1000");
            t1000.createRobot();
            t1000.dance();
            System.out.println("\n");
        }

    }
}
