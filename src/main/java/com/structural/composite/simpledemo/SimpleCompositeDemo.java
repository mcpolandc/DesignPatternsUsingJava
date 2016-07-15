package com.structural.composite.simpledemo;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *      The idea of the Composite is that it is meant to treat your components the same
 *      whether it is part of your structure or the whole structure.
 *
 *      Below is an example of this at work.
 *
 *      The HashMap (like most of the Collections in Java) allows you to add instances of a Collection to
 *      itself. The beauty of it is that all of these objects are treated the same and have the same functions
 *      available regardless of whether it exists inside another instance of a collection or not.
 *
 *      This is a very powerful concept
 *
 */

public class SimpleCompositeDemo {

    public static void main(String[] args) {

        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String, String> allAttributes = new HashMap<>();
        allAttributes.putAll(personAttributes);
        allAttributes.putAll(groupAttributes);

        System.out.println(allAttributes);
    }
}
