package sakshi.demo;

import java.util.*;

public class Array_insert {

    public static void main(String[] args) {

        int size, loc, item;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size");
        size = sc.nextInt();

        int a[] = new int[size + 1];
        System.out.println("enter the array element");

        for (int i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("enter array location");
        loc = sc.nextInt();

        System.out.println("enter the new item");
        item = sc.nextInt();

        for (int i = size - 1; i >= loc; i--) 
        {
            a[i + 1] = a[i];
        }

        a[loc] = item;
        size++;

        for (int i = 0; i < size; i++) 
        {
            System.out.println(a[i] + "");
        }

    }

}
