package com.telusko;

import org.springframework.aop.scope.ScopedProxyUtils;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop Constructor");
    }


    public void compile(){
        System.out.println("compiling in laptop");

    }
}
