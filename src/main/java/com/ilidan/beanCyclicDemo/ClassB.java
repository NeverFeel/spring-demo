package com.ilidan.beanCyclicDemo;

public class ClassB {

    private ClassC classC;

    public ClassB(ClassC classC) {
        System.out.println("ClassB constructor invoked!");
        this.classC = classC;
    }

}
