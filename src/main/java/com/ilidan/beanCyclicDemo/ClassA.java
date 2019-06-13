package com.ilidan.beanCyclicDemo;

public class ClassA {

    private ClassB classB;

    public ClassA(ClassB classB) {
        System.out.println("ClassA constructor invoked!");
        this.classB = classB;
    }

}
