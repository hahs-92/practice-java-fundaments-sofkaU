package com.hahs.sofkau.domain;

public interface IDeliverable {
    void deliver();
    void giveBack();
    boolean isDelivered();
    IDeliverable compareTo(IDeliverable object);
}
