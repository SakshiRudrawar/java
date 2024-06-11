package Hashcode.demo;

import java.util.HashSet;
import java.util.Iterator;

public class Demo_hashset {

    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("sakshi");
        name.add("suresh");
        name.add("mahesh");
        name.add("Suresh"); // Note: HashSet is case-sensitive, so "Suresh" and "suresh" are considered different
        name.add("suraj");
        name.add("priti");

        for (String ref : name) {
            System.out.println(ref); // using ref display a names only in unorderd list
            System.out.println(ref.hashCode());
        }

        Iterator<String> iter = name.iterator();

        while (iter.hasNext()) {
            String currentValue = iter.next();

            if (currentValue.equals("priti")) {
                iter.remove();
            }
        }

        // Print the updated set
        System.out.println("After removing 'priti':");
        for (String ref : name) {
            System.out.println(ref);
        }
    }

}

