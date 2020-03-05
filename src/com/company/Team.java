package com.company;


import java.util.Random;

public class Team {
    public String[]footballers=new String[]{"Ricardo1","Richard2","Peter3","Avgo4","Marasso5","Ernesto6","Mike7","Macco8","Jake9",
            "Leonardo10","Muschino11"};
    private String[]in=new String[]{"Leonel1","Postman2","Nasser3","Bernardo4","Nardo5","John6","Rob7",
    "Bendjamin8","Tima9","Polaroid10","Krushka11"};
    public  int change=0;
    public  static final int CHANGE_LIMIT=3;
    public int goal=0;
    public static final int GOAL_LIMIT=15;
    public int yellowCard=0;
    public static final int YELLOW_CART_LIMIT=15;
    private Events allEvent=new Events();
    private Events goals=new Events();
    private Events replacement=new Events();
     private Events card=new Events();

    public void setFootballers(String[] footballers) {
        this.footballers = footballers;
    }

    public String[] getIn() {
        return in;
    }

    public void setIn(String[] in) {
        this.in = in;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public static int getChangeLimit() {
        return CHANGE_LIMIT;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public static int getGoalLimit() {
        return GOAL_LIMIT;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public static int getYellowCartLimit() {
        return YELLOW_CART_LIMIT;
    }

    public Events getAllEvent() {
        return allEvent;
    }

    public void setAllEvent(Events allEvent) {
        this.allEvent = allEvent;
    }

    public Events getGoals() {
        return goals;
    }

    public void setGoals(Events goals) {
        this.goals = goals;
    }

    public Events getReplacement() {
        return replacement;
    }

    public void setReplacement(Events replacement) {
        this.replacement = replacement;
    }

    public Events getCard() {
        return card;
    }

    public void setCard(Events card) {
        this.card = card;
    }

    public String getFootballers(){
        Random r=new Random();
        return footballers[r.nextInt(footballers.length)];
    }
    public  void addGoal(Events events){
        goals.addEvents(events);
        goal++;
    }
    public void addChange(Events events){
       change.addEvents(events);//не знаю почему не добавляется
       change++;
    }
    public void addYellowCard(Events events){
        card.addEvents(events);
        yellowCard++;
    }
    public void printReplacement(){
        allEvent.printEvent();
        System.out.println("ГОЛЫЫЫЫ");
        goals.printEvent();
        System.out.println("Замеееееенаааа");
        change.printEvent();//и здесь также
        System.out.println("Жьеееееелтыыыыеее ХАРТЫ");
        card.printEvent();
    }
    public String offside(){
        String k="";
       Random r=new Random();
       int i=r.nextInt(footballers.length);
       k +=footballers[i]+ "отрекаю тебя на ";
       int a=r.nextInt(in.length);
       footballers[i]=null;
       return k+footballers[i];
    }
    private void Inkou(){
        String[]i1=new String[in.length-1];
        int kop=0;
        for(int i=0;i<i1.length;i++){
            if(in[i]!=null){
                i1[kop]=in[i];
                kop++;
            }
        }
    }
}
