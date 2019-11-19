package edu.zju.week2;

public class Display {
    private int value = 0;
    private int limit;

    public Display(int _limit) {
        limit = _limit;
    }

    public void increase() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    protected void setValue(int t) {
        value = t;
    }
    public static void main(String[] args){}
}
