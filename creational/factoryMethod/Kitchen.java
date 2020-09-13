package com.newbie.creational.factoryMethod;

// User class for demonstration work of FactoryMethods pattern

public class Kitchen {

    public static void main(String[] args) {

        FirstCourseFactory firstCourseFactory = createFirstCoursFactory("borscht");
        FirstCourse firstCourse = firstCourseFactory.firstCourseCreation();

        firstCourse.toCook();
    }

    static FirstCourseFactory createFirstCoursFactory(String nameFirstCours){
        if (nameFirstCours.equalsIgnoreCase("soup")) return new SoupFactory();
         else if (nameFirstCours.equalsIgnoreCase("borscht")) return new BorschtFactory();
         else throw new RuntimeException(nameFirstCours + " is absent in our MENU !");
    }
}
