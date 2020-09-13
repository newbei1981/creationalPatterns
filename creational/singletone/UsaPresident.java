package com.newbie.creational.singletone;

public class UsaPresident {

    public static void main(String[] args) {

        System.out.println("Now : ");
        President.getInstance().showPresident();
        System.out.println("Presidential elections.....");
        President.getInstance().changesInTheCountry("New President");
        President.getInstance().showPresident();

    }

}