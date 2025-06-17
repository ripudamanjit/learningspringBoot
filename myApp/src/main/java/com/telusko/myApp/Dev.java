package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev  {
    @Autowired//field injection
    @Qualifier("laptop")
    private Computer comp;
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public void build(){

        comp.compile();
        //debug();
        System.out.println("working on Awesome Project");
    }
}
