package com.ilidan;

import com.ilidan.firstDemo.People;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PeopleTest {


    public static void main(String[] args) {

        ClassPathResource beansResource = new ClassPathResource("beansConfig.xml");
        XmlBeanFactory bf = new XmlBeanFactory(beansResource);
        People people = (People) bf.getBean("people");
        System.out.println(people);
    }

}
