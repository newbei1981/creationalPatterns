package com.newbie.creational.prototype;

public class ClientProducts {

    public static void main(String[] args) {
        Product prototype = new Product("Toy",100);
        System.out.println(prototype);
        System.out.println("------------------------------");
        ProductFactory productFactory = new ProductFactory(prototype);
        Product clonePrototype = productFactory.cloneCreater();
        System.out.println(clonePrototype);
    }
}
