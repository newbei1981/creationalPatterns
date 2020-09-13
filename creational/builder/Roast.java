package com.newbie.creational.builder;

public class Roast extends DishesBuilder {

    @Override
    void buildName() {
        dishes.setName("Roast");
    }

    @Override
    void buildComposition() {
        dishes.setComposition("Fry meet with vegetables and potato ! ");
    }

    @Override
    void buildWeight() {
        dishes.setWeight(400);
    }

    @Override
    void buildPrice() {
        dishes.setPrice(150);
    }
}
