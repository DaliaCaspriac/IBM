package thinkinginjava.innerclasses.exercise07;

public class OuterClass {
    private String name;

    public OuterClass(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public void changeFromOuter(){
        InnerClass innerClass = new InnerClass();
        innerClass.changeName();
    }

    protected class InnerClass {

        public InnerClass() {
        }

        private void changeName() {
            name += " ***";
            System.out.println(getName());
        }
    }
}