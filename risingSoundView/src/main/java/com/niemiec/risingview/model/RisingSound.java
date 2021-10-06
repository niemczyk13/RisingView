package com.niemiec.risingview.model;

public class RisingSound {
    private boolean isOn;
    private int time;

    public RisingSound(boolean isOn, int time) {
        this.isOn = isOn;
        this.time = time;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
