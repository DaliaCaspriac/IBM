package thinkinginjava.arrays.exercise03;

public class Main {
    public static double[][] createTwodimensionalArray(int size1, int size2, double start, double end) {
        double[][] doubles = new double[size1][size2];
        double value = start;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (value > end) {
                    value = start;
                }
                doubles[i][j] = value++;
            }
        }
        return doubles;
    }

    public static void printArray(double[][] doubles, int size1, int size2) {
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(doubles[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printArray(createTwodimensionalArray(3, 4, 1d, 9d), 3, 4);
        System.out.println("----------");

        printArray(createTwodimensionalArray(2, 2, 10d, 99d), 2, 2);
        System.out.println("----------");

        printArray(createTwodimensionalArray(6, 4, 50.3d, 64.5d), 6, 4);
        System.out.println("----------");
    }
}
