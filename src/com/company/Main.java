package com.company;

public class Main {
// Sorting
    public static void main(String[] args) {
       int [] a={5,12,78,96,32,45,2,12,14};
       for (int x:a) {
           System.out.print(x + ",");
       }
       int count;
       do {
           count = 0;
           for (int i = 0; i < a.length - 1; i++) {
               if (a[i] > a[i + 1]) {
                   int val = a[i];
                   a[i] = a[i + 1];
                   a[i + 1] = val;
                   count++;

               }
           }
       }while (count >0) ;
        System.out.println();
        for (int x:a) {
            System.out.print(x + ",");
        }
    }
}