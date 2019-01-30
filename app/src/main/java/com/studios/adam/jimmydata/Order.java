package com.studios.adam.jimmydata;

import java.time.*;


public class Order {

    private Money subTotal;
    private Money tip;
    private Money finalTotal;
    private Instant timeOrderPlaced;
    private Instant timeOrderLeft;
    private Instant timeOrderArrived;
    private Duration otdTime;
    private Duration travelTime;
    //private String note;
    //private String[] tags;

    //default constructor just all nulls for now
    public Order(){
         subTotal= null;
         tip= null;
         finalTotal= null;
         timeOrderPlaced= null;
         timeOrderLeft= null;
         timeOrderArrived= null;
         otdTime= null;
         travelTime= null;
    }

    //constructor for standard input
    public Order(Money subTotal, Instant timeOrderPlaced, Instant timeOrderLeft){
        this.subTotal = subTotal;
        this.timeOrderPlaced = timeOrderPlaced;
        this.timeOrderLeft = timeOrderLeft;
        tip = null;
        finalTotal = null;
        timeOrderArrived = null;
        travelTime = null;

        //probably do this type of auto creation in constructor here - figure out soon
        //otd_time = timeOrderLeft - timeOrderPlaced;
        otdTime = null;
    }

    public Money getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Money subTotal) {
        this.subTotal = subTotal;
    }

    public Money getTip() {
        return tip;
    }

    public void setTip(Money tip) {
        this.tip = tip;
    }

    public Money getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal() {
        finalTotal = this.subTotal.plus(this.tip);
    }

    public Instant getTimeOrderPlaced() {
        return timeOrderPlaced;
    }

    public void setTimeOrderPlaced(Instant timeOrderPlaced) {
        this.timeOrderPlaced = timeOrderPlaced;
    }

    public Instant getTimeOrderLeft() {
        return timeOrderLeft;
    }

    public void setTimeOrderLeft(Instant timeOrderLeft) {
        this.timeOrderLeft = timeOrderLeft;
    }

    public Instant getTimeOrderArrived() {
        return timeOrderArrived;
    }

    public void setTimeOrderArrived(Instant timeOrderArrived) {
        this.timeOrderArrived = timeOrderArrived;
    }

    public Duration getTravel_time() {
        return travelTime;
    }

    public void setTravel_time(Duration travel_time) {
        this.travelTime = travel_time;
    }

    public Duration getOtdTime(){
        return otdTime;
    }
}
