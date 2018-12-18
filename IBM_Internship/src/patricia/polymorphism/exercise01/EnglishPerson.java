package patricia.polymorphism.exercise01;

public class EnglishPerson extends Person {
    private String birthDate;

    public EnglishPerson(String firstname, String surname, String birthDate) {
        super(firstname, surname);
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String selfDescribe() {
        return "I am " + convertBirthDateToAge(this.birthDate);
    }

    public static int convertBirthDateToAge(String birthDate) {
        String[] parts = birthDate.split("-");
        int year = Integer.parseInt(parts[parts.length - 1]);
        return 2018 - year;
    }
}
