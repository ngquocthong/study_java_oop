package com.time;

// Time extends Object as default
public class Time {
    private int hour, minute, second;
    //instance method
    public void setTime(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",((hour==0||hour==12)?12:hour%12),
                                                minute,second,(hour<12)?"AM":"PM"); // ternary Operator

    }
}
