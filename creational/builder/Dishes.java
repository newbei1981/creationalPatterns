package com.newbie.creational.builder;

public class Dishes {
    private String name;
    private String composition;
    private int weight;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  " name : " + name +
                " ; composition : " + composition +
                " ; weight : " + weight +
                " gr. ; price=" + price +
                " grn.";
    }
}
