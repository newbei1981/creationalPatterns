package com.newbie.creational.builder;

public class MenuBuilder {

    public static void main(String[] args) {
        RestaurantsAdministrator administrator = new RestaurantsAdministrator();
        administrator.setDishesBuilder(new MuttonKebab());
        Dishes dishes1 = administrator.buildDishes();
        administrator.setDishesBuilder(new Roast());
        Dishes dishes2 = administrator.buildDishes();
        System.out.println("First dishes is : " + dishes1);
        System.out.println("Second dishes is : " + dishes2);


    }
}
