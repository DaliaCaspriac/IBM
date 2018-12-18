package thinkinginjava.innerclasses.exercise06.two;

import thinkinginjava.innerclasses.exercise06.one.MyInterface;

public class MyClass {
    protected class MyInnerClass implements MyInterface {

        public MyInnerClass() {
        }

        @Override
        public void write() {
            System.out.println("write something");
        }
    }
}