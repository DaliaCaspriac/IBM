package thinkinginjava.errorhandlingwithexceptions.exercise10;

public class Exercise10 {
    public void f() throws MySecondException{
        try{
            g();
        }catch (MyFirstException e){
            throw new MySecondException("Message from f() method... " + e);
        }
    }

    public void g() throws MyFirstException{
        throw new MyFirstException("Message from g() method... ");
    }
}
