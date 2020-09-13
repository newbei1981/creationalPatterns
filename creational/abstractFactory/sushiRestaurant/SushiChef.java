package com.newbie.creational.abstractFactory.sushiRestaurant;

import com.newbie.creational.abstractFactory.Chef;

public class SushiChef implements Chef {
    @Override
    public void controlTheKitchen() {
        System.out.println("Chef: Kitchen is on my contol. My sushi is the Best!");
    }
}
