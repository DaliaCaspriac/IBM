package thinkinginjava.errorhandlingwithexceptions.exercise08;

import thinkinginjava.errorhandlingwithexceptions.exercise04.MyException;

public class Exercise08 {
    public static void myMethod() throws MyException{
        throw new MyException("Exception from myMethod from Exercise08...");
    }

    public static void main(String[] args) {
        try{
            myMethod();
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}