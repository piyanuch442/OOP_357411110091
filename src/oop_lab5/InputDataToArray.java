package oop_lab5;

import java.util.Scanner;

public class InputDataToArray {
    private static  final int MAX = 10;

    public static void main(String[] args) {
        int num[] = new int[MAX];
        num = inputData(num);
        showData(num);


    }

    private static void showData(int[] num) {
        System.out.println("Data in array: ");
        for (int val:num)
            System.out.print(val+" ");
    }

    private static int[] inputData(int []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter data to array : ");
        for (int i=0; i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();
        }
        return num;
    }



}
