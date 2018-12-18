package thinkinginjava.interfaces.exercise05impl;

import thinkinginjava.interfaces.exercise05.MyInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface impl = new MyClass();
        System.out.println(impl.getId());
        System.out.println(impl.getName());
        System.out.println(impl.getAge());
    }
}
