package com.spring.xml.conf.robots;

import com.spring.xml.conf.service.interf.IHand;
import com.spring.xml.conf.service.interf.IHead;
import com.spring.xml.conf.service.interf.ILeg;
import com.spring.xml.conf.service.interf.IRobot;

public class ModelT1000 implements IRobot {

    private IHand hand;
    private ILeg leg;
    private IHead head;

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000(IHand hand, ILeg leg, IHead head, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }


    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(IHand hand, ILeg leg, IHead head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }


    public void createRobot() {
//        head.createHaed();
//        hand.createHand();
//        leg.createLeg();
        System.out.println(color);
        System.out.println(year);
        System.out.println(isSoundEnabled());
    }

    public void dance() {
        System.out.println("T1000 simple is dancing");
    }


    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
