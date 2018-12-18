package thinkinginjava.interfaces.exercise04;

public class Main {
    public static void staticMethod(BaseClass baseClass){
        DerivedClass derivedClass = (DerivedClass)baseClass;
        derivedClass.print();
    }

    public static void anotherStatic(BaseClass baseClass){
        baseClass.print();
    }
    public static void main(String[] args) {
        staticMethod(new DerivedClass());
        anotherStatic(new DerivedClass());
    }
}
