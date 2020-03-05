package com.company;

public class Events {
    private String k= " ";
    public Events (String k, Times t){
        this.k += t.toString() + " ~ " + k;
    }

    public Events() {

    }

    public void addEvents(Events events){
        k +=events.toString() + "\n";
    }

    @Override
    public String toString() {
        return k;
    }
    public void printEvent(){
        System.out.println(k);
    }
}
