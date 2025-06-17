package com.telusko;


public class Dev {
  private Computer com;

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("dev1 constructor ");
//    }


    public Dev() {
        System.out.println("Dev Constructor");
    }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        System.out.println("working on Awesome Project");
        com.compile();
    }
}
