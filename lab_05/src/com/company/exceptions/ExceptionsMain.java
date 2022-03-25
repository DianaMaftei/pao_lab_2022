package com.company.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionsMain {

    public static void main(String[] args) {
//        playWithUncheckedExceptions();
//        handleCheckedException();
//        handleCheckedException2();
//        testingReturn();

        throw new CustomUncheckedException("my custom unchecked");
    }


    private static void handleCheckedException() {
        try {
            testingCheckedExceptions();
            System.out.println("in try");
        } catch (IOException e) {
            System.out.println("Am rezolvat eroarea");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("something");
        }

        System.out.println("at the end");

    }

    private static void handleCheckedException2() {
        try {
            testingCheckedExceptions2();
            System.out.println("in try");
        } catch (IOException e) {
            System.out.println("in io");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("in arith or null");
        } catch (Exception e) {
            System.out.println("in exc");
        } finally {
            System.out.println("something");
        }

        System.out.println("at the end");
    }

    private static void playWithUncheckedExceptions() {
        nullPointerException();
        arrayIndexOutOfBoundsException();
        stringIndexOutOfBoundsException();
        arithmeticException();
        illegalArgumentException();
        classCastException();
    }

    private static void nullPointerException() {
        String p = null;
        p.length();
    }

    private static void arrayIndexOutOfBoundsException() {
        System.out.println("in array exc");
        int[] arr = {1, 2};
        System.out.println(arr[2]);
    }

    private static void stringIndexOutOfBoundsException() {
        String a = "Something";
        a.charAt(a.length() + 10);
    }

    private static void arithmeticException() {
        System.out.println(1 / 0);
    }

    private static void illegalArgumentException() {
        String a = "Something";
        Integer.parseInt(a);
    }

    private static void classCastException() {
        Object i = Integer.valueOf(42);
        String s = (String) i;
    }

    private static void testingUncheckedExceptions() {
        throw new RuntimeException("eroare");
    }

    private static void testingCheckedExceptions() throws IOException, SQLException {
        throw new IOException("eroare");
    }

    private static void testingCheckedExceptions2() throws Exception {
        throw new Exception("eroare");
    }

    private static void testingReturn() {
        try{
            System.out.println("in try");
            return;
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally{
            System.out.println("in finally");
        }

        System.out.println("at the end of method");
    }

}
