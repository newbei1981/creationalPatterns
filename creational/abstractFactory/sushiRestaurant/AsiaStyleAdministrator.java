package com.newbie.creational.abstractFactory.sushiRestaurant;

import com.newbie.creational.abstractFactory.HallAdministrator;

public class AsiaStyleAdministrator implements HallAdministrator {
    @Override
    public void controlHall() {
        System.out.println("Administrator: I am the best in the design of the hall in Asian style look it now..");
    }

}

