package com.ilidan.beanCyclicDemo;

public class ClassC {

    private ClassA classA;

    public ClassC(){

    }

    public ClassC(ClassA classA) {
        System.out.println("ClassC constructor invoked!");
        this.classA = classA;
    }

}
