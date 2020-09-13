package com.newbie.creational.builder;

public abstract class DishesBuilder {
    Dishes dishes;

    void createDishes(){
        dishes = new Dishes();
    }

    abstract void buildName();
    abstract void buildComposition();
    abstract void buildWeight();
    abstract void buildPrice();

    Dishes getDishes(){
        return dishes;
    }

}
