package com.spring.xml.conf.robots;

import com.spring.xml.conf.service.interf.IHand;
import com.spring.xml.conf.service.interf.IHead;
import com.spring.xml.conf.service.interf.ILeg;
import com.spring.xml.conf.service.interf.IRobot;

public class ModelT1000getset implements IRobot {

    private IHand hand;
    private ILeg leg;
    private IHead head;

/*    public ModelT1000getset(IHead head, IHand hand, ILeg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }*/

    public void createRobot() {

        head.createHaed();
        hand.createHand();
        leg.createLeg();
    }

    public void dance() {
        System.out.println("T1000getset is dancing");
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
}
