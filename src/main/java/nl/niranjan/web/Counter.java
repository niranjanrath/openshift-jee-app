package nl.niranjan.web;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Counter {

    private int count=1;

    public int increamentCount(){
        return this.count++;
    }
}
