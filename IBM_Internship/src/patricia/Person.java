package patricia;

/*
Create a class that holds the firstname and the surname of a person.
 Make it have two constructors, one with both firstname and surname,
 and one with full name (we assume each individual has only one surname
  and at least one firstname separated by spaces). Test in main class.
 */
public class Person {
    private String firstname;
    private String surname;

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public Person(String fullName) {
        String[] parts = fullName.split(" ");
        int index = parts.length - 1;
        this.surname = parts[index];
        String fName = "";
        for (int i = 0; i < parts.length - 1; i++) {
            fName += parts[i] + " ";
        }
        this.firstname = fName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}