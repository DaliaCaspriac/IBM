package thinkinginjava.controllingexecution;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Exercise 8 with Break");
        printWithBreak();
        System.out.println();
        System.out.println("Exercise 8 without Break");
        printWithoutBreak();
    }

    //Exercise 8:(2) Create a switch statement that prints a message for each case,
    // and put the switch inside a for loop that tries each case.
    // Put a break after each case and test it, then remove the breaks and see what happens.
    public static void printWithBreak() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.print("One, ");
                    break;
                case 3:
                    System.out.print("Three, ");
                    break;
                case 5:
                    System.out.print("Five, ");
                    break;
                default:
                    System.out.print("Two or Four, ");
            }
        }
    }

    public static void printWithoutBreak() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.print("One, ");
                case 3:
                    System.out.print("Three, ");
                case 5:
                    System.out.print("Five, ");
                default:
                    System.out.print("Two or Four, ");
            }
        }
    }
}
