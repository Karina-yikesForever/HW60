package com.company;

import java.util.Random;

public class ThreadTeam extends  Thread {
    Times t = new Times();

    public ThreadTeam() {
    }

    @Override
    public void run() {
        Random r = new Random();
        Team team = new Team();
        while (!t.entMach()) {
            int i = r.nextInt(3);
            if (i == 0) {
                int a = r.nextInt(1000);
                if (a <= 10) {
                    Events events = new Events(t.getFootballist() + " забивает гол", t);
                    if (t.getGoals() < Team.GOAL_LIMIT) {
                        t.addEvents(events);
                        t.addGoal(events);
                    }
                }
            } else if (i == 1) {
                int a = r.nextInt(1000);
                if (a <= 10) {
                    //замена
                    if (t.getChange() < Team.CHANGE_LIMIT) {
                        Events e = new Events(t.replacement(), t);
                        t.addEvents(e);
                        t.addChange(e);
                    }
                }
            } else if (i == 2) {
                int a = r.nextInt(1000);
                if (a <= 10) {
                    //Жовта
                    if (t.getYellow() < Team.YELLOW_CART_LIMIT) {
                        Events e = new Events(t.getFootballist() + " получает жолтую карточку", t);
                        t.addEvents(e);
                        t.addYellow(e);
                    }
                }
            }
        }
    }
        t.printReplacement();
}
