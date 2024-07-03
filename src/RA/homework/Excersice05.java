package RA.homework;

public class Excersice05 {
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (double num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (double num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("Max of intArray: " + maxOfArray(intArray));
        System.out.println("Max of doubleArray: " + maxOfArray(doubleArray));

        System.out.println("Min of intArray: " + minOfArray(intArray));
        System.out.println("Min of doubleArray: " + minOfArray(doubleArray));
    }
}
