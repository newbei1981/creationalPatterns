package com.newbie.creational.abstractFactory.sushiRestaurant;

import com.newbie.creational.abstractFactory.Accountant;
import com.newbie.creational.abstractFactory.Chef;
import com.newbie.creational.abstractFactory.HallAdministrator;
import com.newbie.creational.abstractFactory.RestaurantTeamFactory;

public class SushiRestaurantTeamFactory implements RestaurantTeamFactory {

    @Override
    public Chef getChef() {
        return new SushiChef();
    }

    @Override
    public HallAdministrator getHallAdministrator() {
        return new AsiaStyleAdministrator();
    }

    @Override
    public Accountant getAccountant() {
        return new RestaurantAccountant();
    }
}
