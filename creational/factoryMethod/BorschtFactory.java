package com.newbie.creational.factoryMethod;

public class BorschtFactory implements FirstCourseFactory{
    @Override
    public FirstCourse firstCourseCreation() {
        return new Borscht();
    }
}
