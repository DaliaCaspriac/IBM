package thinkinginjava.errorhandlingwithexceptions.exercise02;

public class Main {
    public static void main(String[] args) {
        Person person = null;
        try{
            String name = person.getName();
        }catch(NullPointerException e){
            System.out.println(".." + e.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
