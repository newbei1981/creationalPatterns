package com.newbie.creational.abstractFactory.sushiRestaurant;

import com.newbie.creational.abstractFactory.Accountant;

public class RestaurantAccountant implements Accountant {
    @Override
    public void keepAccounting() {
        System.out.println("Accountant: I am the best accountant in the restaurant business. I am ready to work! ");

    }
}
