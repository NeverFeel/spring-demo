package com.ilidan;

import com.ilidan.beanCyclicDemo.ClassC;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanCyclicTest {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beansConfig.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);
        System.out.println("--------------------------");
        //获取bean时抛出异常信息
//        ClassA classA = beanFactory.getBean("classA", ClassA.class);
        ClassC classC = beanFactory.getBean("classC", ClassC.class);
    }

}
