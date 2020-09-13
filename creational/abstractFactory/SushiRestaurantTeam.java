package com.newbie.creational.abstractFactory;

import com.newbie.creational.abstractFactory.sushiRestaurant.SushiRestaurantTeamFactory;

public class SushiRestaurantTeam {

    public static void main(String[] args) {
       RestaurantTeamFactory restaurantTeamFactory = new SushiRestaurantTeamFactory();
       Chef chef = restaurantTeamFactory.getChef();
       HallAdministrator hallAdministrator = restaurantTeamFactory.getHallAdministrator();
       Accountant accountant = restaurantTeamFactory.getAccountant();

       System.out.println("Restaurant is open :");
       chef.controlTheKitchen();
       hallAdministrator.controlHall();
       accountant.keepAccounting();
    }
}
