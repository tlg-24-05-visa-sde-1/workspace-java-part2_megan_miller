package com.javatunes.billing;

public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalculator(Location location) {
        return switch (location) {
            case ONLINE -> new OnlineTax();
            case USA -> new USATax();
            case EUROPE -> new EuropeTax();
        };
    }
}


//        switch (location) {  // using the new switch, early return version. BC we return early, no need for breaks.
//            case ONLINE:
//                return new OnlineTax();
//            case USA:
//                return new USATax();
//            case EUROPE:
//                return new EuropeTax();
//        }
//        return null; // have to use return null at the end with this.
//    }
//
//        switch (location) {
//            case ONLINE:
//                calc = new OnlineTax();
//                break;
//            case USA:
//                calc = new USATax();
//                break;
//            case EUROPE:
//                calc = new EuropeTax();
//
//        }
//        return calc;
//        }


