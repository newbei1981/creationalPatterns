package com.newbie.creational.abstractFactory;

public interface RestaurantTeamFactory {
    Chef getChef();
    HallAdministrator getHallAdministrator();
    Accountant getAccountant();
}
