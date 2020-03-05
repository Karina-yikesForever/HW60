package com.company;

public class Main {

    public static void main(String[] args) {
	Thread tv=new ThreadTeam();
	Thread tv1=new ThreadTeam();
	tv.start();
	tv1.start();
    }
}
