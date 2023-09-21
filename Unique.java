package com.Array.pack;

public class Unique {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,3,3};

        System.out.println("Unique elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(array[i] + " ");
            }
        }
    }
}