package com.newbie.creational.builder;

public class MuttonKebab extends DishesBuilder{

    @Override
    void buildName() {
        dishes.setName("Mutton Kebab");
    }

    @Override
    void buildComposition() {
        dishes.setComposition("Meet of Mutton");
    }

    @Override
    void buildWeight() {
        dishes.setWeight(300);
    }

    @Override
    void buildPrice() {
        dishes.setPrice(200);
    }
}
