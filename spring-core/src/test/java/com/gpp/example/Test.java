package com.gpp.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by gaopanpan on 16/11/21.
 */
public class Test {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        BeanObj bean = (BeanObj) beanFactory.getBean("bean");
        System.out.println(bean.getMsg());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanObj beanObj = (BeanObj) context.getBean("bean");
        System.out.println(beanObj.getMsg());
        System.out.println(bean == beanObj);
    }
}
