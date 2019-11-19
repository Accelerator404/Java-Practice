package edu.zju.week2;

public class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int _limit) {
        limit = _limit;
    }

    public void increase() {
        value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] Args) {
        Display d = new Display(24);
        for (; ; ) {
            d.increase();
            System.out.println(d.getValue());
        }

    }
}
