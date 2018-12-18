package thinkinginjava.innerclasses.exercise06.three;

import thinkinginjava.innerclasses.exercise06.one.MyInterface;
import thinkinginjava.innerclasses.exercise06.two.MyClass;

public class Main extends MyClass {
    public MyInterface getInnerClass(){
        return this.new MyInnerClass();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.getInnerClass().write();
    }
}