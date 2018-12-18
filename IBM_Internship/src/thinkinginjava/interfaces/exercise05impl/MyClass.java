package thinkinginjava.interfaces.exercise05impl;

import thinkinginjava.interfaces.exercise05.MyInterface;

public class MyClass implements MyInterface {
    @Override
    public String getName() {
        return "dalia";
    }

    @Override
    public int getAge() {
        return 22;
    }

    @Override
    public long getId() {
        return 1;
    }
}
