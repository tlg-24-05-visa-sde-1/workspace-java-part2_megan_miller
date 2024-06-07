/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

   @Before
   public void setUp() {
       catalog = new InMemoryCatalog();
   }

    @Test
    public void findCheapRock_returnsCheapRock_isValid() {
       Collection<MusicItem> classicRockItems =catalog.findByCategory(MusicCategory.CLASSIC_ROCK);
       assertEquals(1, classicRockItems.size());
    }

    @Test
    public void findCategory



    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(6L);
        System.out.println(found); // toString() auto called

        MusicItem notFound = catalog.findById(101L);
        System.out.println("ID not found: " + notFound);
    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> keywordItems = catalog.findByKeyword("Seal");
        dump(keywordItems);
    }



    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        catalog.size();
        System.out.println();
    }

    private static void testGetAll() {
    }

    private static void dump(Collection<MusicItem> items){
        for(MusicItem item : items){
            System.out.println(item);
        }
    }
}