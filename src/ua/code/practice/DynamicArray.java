package ua.code.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Enter value: ");
            // increase size of array
            if (count >= arr.length) {
//                int[] temp = new int[count * 2];
//                for (int i = 0; i < arr.length; i++) {
//                    temp[i] = arr[i];
//                }
//                arr = temp;
                arr = Arrays.copyOf(arr, arr.length * 2);
            }
            arr[count] = sc.nextInt();
            count++;
            System.out.println("Press 'y' if you want to enter next value");
            String answer = sc.next();
            if (!answer.equals("y")) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
