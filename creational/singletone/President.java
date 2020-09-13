package com.newbie.creational.singletone;

public class President {
    private static String fullName = "Donald Trump";
    private static President president;

    private President(){}

    public static President getInstance(){
        if (president == null) president = new President();
        return president;
    }

    public void showPresident(){
        System.out.println("Currently the President of the United States : " + fullName);
    }

    public void changesInTheCountry(String newPresident){
        fullName = newPresident;
    }
}
