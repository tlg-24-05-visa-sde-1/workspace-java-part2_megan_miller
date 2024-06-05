package com.crisp;

import java.util.Comparator;

class RadishSproutsOnTopComparator implements Comparator<Radish> {
    @Override
    public int compare(Radish radish1, Radish radish2){
        return Integer.compare(radish1.getSproutsOnTop(), radish1.getSproutsOnTop());
    }
}
