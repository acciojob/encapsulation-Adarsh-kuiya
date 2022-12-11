package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r= new RWOnly();
        //r.name="hello";
        //System.out.println(name);
        //java: name has private access in com.driver.RWOnly
        r.setName("RAM");
        String ans= r.getName();
        System.out.println(ans);

    }
}