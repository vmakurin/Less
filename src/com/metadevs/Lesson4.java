package com.metadevs;

public class Lesson4 {
    public static void main(String[] arg) {
        int year = 2980;
        for (int j = 0; j < 6; j++) {
            System.out.println("Год " + year++);
        }
        int[] araiV1 = new int[]{12, 323, 857, 698, 8667};
        System.out.println(araiV1[4]);
        araiV1[3] = 67;
        for (int j = 0; j < araiV1.length; j++) {
            System.out.println(araiV1[j]);
        }
        for (int item : araiV1) {
            System.out.println(item);
        }
        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);
    }

}
