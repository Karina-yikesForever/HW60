package com.company;

public class Times {
    private int hv = 0;
    private int sec = 0;

    public void addSec(int i) {
        sec += i;
        if (sec >= 60) {
            hv++;
            sec -= 60;
        }
    }

    public boolean entMach() {
        return hv >= 90;
    }

    @Override
    public String toString() {
        return (hv < 10 ? "0" + hv : "" + hv) + ":" + (sec < 10 ? "0" + sec : sec);
    }

    public void addEvents(Events e) {
    }


}




