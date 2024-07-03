package RA.homework;

public class Excersice04 {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double sumOfArray(double[] arr) {
        double sum = 0.0;
        for(double num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("Sum of intArray: " + sumOfArray(intArray));
        System.out.println("Sum of doubleArray: " + sumOfArray(doubleArray));
    }
}
