package com.company;

public class Main {
        public static void main(String[] args) {
            int [] array = {11, 3, 14, 16, 7};
            int length = array.length;
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < length-1; i++) {
                    if(array[i+1] < array[i]){
                        isSorted = false;
                        buf = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buf;
                    }
                }
            }
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
}
