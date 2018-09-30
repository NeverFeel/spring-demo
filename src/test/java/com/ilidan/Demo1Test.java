package com.ilidan;

import com.ilidan.demo1.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo1Test {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("demo1Beans.xml");

//        BeanFactory bf = new XmlBeanFactory(resource);//该方法已经被废弃

        BeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory) bf);//XmlBeanDefinitionReader应用于对资源文件的读取和注册
        reader.loadBeanDefinitions(resource);

        Student student = (Student) bf.getBean("student");
        student.setStudentName("ilidan");
        student.setAge(23);
        System.out.println(student);
    }

}
