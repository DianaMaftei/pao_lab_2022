package com.company.examprep.model2;

public class Ex3 {
    private int x;
    private boolean flag;
    protected String s;

    @Override
    public String toString() {
        return x + " " + flag + " " + s;
    }

    public static void main(String[] args) {
        Ex3 basicInit = new Ex3();
        System.out.println(basicInit);
    }
}
