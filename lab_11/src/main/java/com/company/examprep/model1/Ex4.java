package com.company.examprep.model1;

public class Ex4 {
    public static void main(String[] args) {
        String s = "Ionel are mere si pereeee!!!";
        String c = "e";
        int x = s.length() - s.replace(c, "").length();
        System.out.println(x);
    }
}
