package thinkinginjava.generics.exercise20;

public class GenericClass {
    public static <T extends MyInterface> void genericMethod(T elem){
        elem.f();
        elem.g();
    }
}
