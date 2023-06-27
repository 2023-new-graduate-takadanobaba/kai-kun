package main.java;

public class VendingMachine {
    boolean push = false;

    public boolean isPushed() {
        return push;
    }

    public void push() {
        push = true;
    }

}
