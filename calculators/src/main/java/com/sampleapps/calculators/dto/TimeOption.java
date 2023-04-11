package com.sampleapps.calculators.dto;

import com.sampleapps.calculators.statics.TimeInterval;

public class TimeOption {

    private double time;

    private TimeInterval period;

    public double getTime() {

        return time;
    }

    public void setTime(double time) {

        this.time = time;
    }

    public TimeInterval getPeriod() {

        return period;
    }

    public void setPeriod(TimeInterval period) {

        this.period = period;
    }

}