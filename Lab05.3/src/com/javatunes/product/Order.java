/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;
import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;
import com.javatunes.billing.TaxCalculatorFactory;

public class Order {
    private String id;
    private double cost;
    private Location location;

    public Order(String id, Location location) {
        this.id = id;
        this.location = location;
    }

    /**
     * We have 3 options to delegate to a TaxCalculator strategy:
     * 1. direct instantiation (NOT a good option here)
     *     if (getLocation() == Location.USA)
     *         new USATax(); ...
     *
     * 2. Call out to a factory, e.g., TaxCalculatorFactory, and "ask" for it (passing indicator)
     *     This is the option we'll implement.
     *
     * 3. let some other party "inject" it into me, and I'll store it in another field
     *     private TaxCalculator calc;
     */

    public double getTax() {
        TaxCalculator calc = TaxCalculatorFactory.getTaxCalculator(getLocation());
        return calc.taxAmount(getCost());
    }

    /*
     * DONE:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart toal and print
     */
    public void processCart(ShoppingCart<? extends Product> cart) {
        System.out.println("Order: " + getId() + " contains the following:");

        Collection<? extends Product> cartItems = cart.allItems();
        for (Product product : cartItems) {
            System.out.println(product.getCode());
        }
        double cartTotal = cart.total();
        System.out.println("Order Total: " + cart.total());
        this.cost = cartTotal;
    }

    public String getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public Location getLocation() {
        return location;
    }
}