package patricia.polymorphism.exercise01;

public class Main {
    public static void main(String[] args) {
        RomanianPerson romanianPerson = new RomanianPerson("andrei", "pop", "10-10-2010");
        EnglishPerson englishPerson = new EnglishPerson("john", "smith", "03-04-1996");
        System.out.println(romanianPerson.getBirthDate());
        System.out.println(romanianPerson.selfDescribe());
        System.out.println("-----------------------------------");
        System.out.println(englishPerson.getBirthDate());
        System.out.println(englishPerson.selfDescribe());
    }
}