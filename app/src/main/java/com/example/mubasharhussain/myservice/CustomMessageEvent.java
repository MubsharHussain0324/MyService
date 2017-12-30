package com.example.mubasharhussain.myservice;

/**
 * Created by MubasharHussain on 12/30/2017.
 */

public class CustomMessageEvent {
    private int Number;

    public CustomMessageEvent(Integer number) {
        Number = number;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
