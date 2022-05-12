package com.company.examprep.model2;

public class Ex9 {

    public static void main(String[] args) {
        System.out.println(breakingStuff());
    }
    public static int breakingStuff() {
        try {
            try {
                throw new Exception();
            } catch (Exception e) {
                return 1;
            } finally {
                return 2;
            }
        } catch (Exception e) {
            return 3;
        } finally {
            return 4;
        }
    }
}
