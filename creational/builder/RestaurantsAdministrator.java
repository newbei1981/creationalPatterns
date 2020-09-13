package com.newbie.creational.builder;

public class RestaurantsAdministrator {
    DishesBuilder dishesBuilder;

    public void setDishesBuilder(DishesBuilder dishesBuilder){
        this.dishesBuilder = dishesBuilder;
    }

    Dishes buildDishes(){
        dishesBuilder.createDishes();
        dishesBuilder.buildName();
        dishesBuilder.buildComposition();
        dishesBuilder.buildWeight();
        dishesBuilder.buildPrice();
        Dishes dishes = dishesBuilder.getDishes();
        return dishes;
    }
}
