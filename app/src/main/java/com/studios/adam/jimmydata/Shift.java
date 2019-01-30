package com.studios.adam.jimmydata;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Shift {

    //TODO:look into what library to use for time and dates
    private Time clockIn;
    private Time clockOut;
    private Date dateOfShift;
    private ArrayList<Trip> trips;

    public Time getClockIn() {
        return clockIn;
    }

    public void setClockIn(Time clockIn) {
        this.clockIn = clockIn;
    }

    public Time getClockOut() {
        return clockOut;
    }

    public void setClockOut(Time clockOut) {
        this.clockOut = clockOut;
    }

    public Date getDateOfShift() {
        return dateOfShift;
    }

    public void setDateOfShift(Date dateOfShift) {
        this.dateOfShift = dateOfShift;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }
}
