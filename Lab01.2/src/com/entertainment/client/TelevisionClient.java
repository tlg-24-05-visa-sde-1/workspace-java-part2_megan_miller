package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {

        // examine == and the .equals() method
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("LG", 52);

        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());

        System.out.println("tvA == tvB: " + (tvA == tvB)); // false (of course)
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB)); // true now

         Set<Television> tvs = new HashSet<>();
         tvs.add(tvA);
         tvs.add(tvB);
        System.out.println("The size of the set is: " + tvs.size());


    }
}
