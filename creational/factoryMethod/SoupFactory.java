package com.newbie.creational.factoryMethod;

public class SoupFactory implements FirstCourseFactory {
    @Override
    public FirstCourse firstCourseCreation() {
        return new Soup();
    }
}
