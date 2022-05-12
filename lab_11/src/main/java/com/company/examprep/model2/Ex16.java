package com.company.examprep.model2;

public class Ex16 {
    public static void main(String[] args) {
        Bb bb = new Bb();
        bb.showHidden();
    }
}

class Aa {
    private int x = 5;
    private void hidden() {
        System.out.println(x);
    }
    public void showHidden() {
        hidden();
    }
}
class Bb extends Aa {
    public int x = 10;

    public void hidden() {
        System.out.println(x);
    }
}
