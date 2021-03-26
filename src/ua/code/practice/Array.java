package ua.code.practice;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] arr = new int[4];
        fillArray(arr);
        fillArrayFromConsole(arr);
        printArr(arr);
        System.out.println(sumOfArrayElements(arr));
    }

    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i] + ";");
        }
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
    }

    public static void fillArrayFromConsole(int[] arr) {
        System.out.println("Fill array of " + arr.length + " elements.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = validateInt(sc);
        }
        sc.close();
    }

    private static int validateInt(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter value: ");
                return sc.nextInt();
            } catch (Exception e) {
                System.err.println("Wrong input, try one more time: ");
                sc.nextLine();
            }
        }
    }
}
