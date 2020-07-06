package com.company;

public class Money {
    private  int a;
    private int b;

    public void add (Money m) {
        this.a = this.a + m.a;
        this.b = this.b + m.b;
        if (this.b >= 100) {
            int d = this.b / 100;
            this.b = this.b - d * 100;
            this.a += d;
        }
    }

    public void sub (Money m) {
        this.a = this.a - m.a;
        this.b = this.b - m.b;
        if (this.b >= 100) {
            int d = this.b / 100;
            this.b = this.b - d * 100;
            this.a += d;
        }
    }

}
