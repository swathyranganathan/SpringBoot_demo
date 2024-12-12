package com.Spring.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
@Autowired
    Laptop lap;
    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }
}


@Component
class Laptop{
    @Autowired
    CPU cpu;
    public void compile(){
        System.out.println("Compiling...");
        cpu.process();
    }
}

@Component
class CPU{
    public void process(){
        System.out.println("Processing...");
    }
}
