package com.structural.composite.complexdemo;

public class ComplexCompositeDemo {


    /*
    *
    *       Here we have built a simple menu system using the Composite pattern.
    *
    *       We are demonstrating how easy it is to nest components within each other and be able to print components
    *       and their children just by calling the toString method that we have overridden on the component. We use the
    *       iterator of the component to print print information about each child of the component. We are only calling
    *       the toString of the top-level parent here which will recurse over the children belonging to it
    *
    *
    * */

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
