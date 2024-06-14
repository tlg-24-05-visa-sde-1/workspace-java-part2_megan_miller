package com.crisp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RadishSortTestLambda {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 1.5, 2.5, 5));
        radishes.add(new Radish("black", 1.0, 0.0, 0));
        radishes.add(new Radish("red", 2.7, 5.5, 0));
        radishes.add(new Radish("pink", 0.9, 0.0, 6));

        System.out.println("Original List: ");
        dump(radishes);

        System.out.println("Sort by natural order (size) : ");
        radishes.sort(null); // passing null means natural order
        dump(radishes);

        System.out.println("Sort by color via lambda as the Comparator");
        radishes.sort( (r1, r2) -> r1.getColor().compareTo(r2.getColor()) );
        dump(radishes);

        System.out.println("Sort by SproutsOnTop via lambda as the Comparator");
        radishes.sort( (r1, r2) -> Integer.compare(r1.getSproutsOnTop(), r2.getSproutsOnTop()) );
        dump(radishes);

        System.out.println("sort by tailLength via lambda as the Comparator");
        radishes.sort( (r1, r2) -> Double.compare(r1.getTailLength(), r2.getTailLength()) );
        dump(radishes);
    }

    private static void dump(List<Radish> radishList) {
        for(Radish radish : radishList){
            System.out.println(radish);  // toString() auto called
        }

        System.out.println();
    }
}
