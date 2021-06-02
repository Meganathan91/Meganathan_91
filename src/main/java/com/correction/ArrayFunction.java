package com.correction;

public class ArrayFunction {
    static void getFunction(int a[]) {
        int input[] = a;
        int min = input[0];
        int max = input[0];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[0]) {
                min = input[i];
            }
            if (input[i] > input[0]) {
                max = input[i];
            }
            sum = sum + input[i];
        }
        System.out.println("Minimum element in array :" + min);
        System.out.println("Maximum element in array :" + max);
        System.out.println("sum of array elements :" + sum);
        System.out.println("Length of an array :" + input.length);
    }

    public static void main(String[] args) {
        int array[] = {1, 4, 3, 5, 2, 6};
        getFunction(array);
    }
}
