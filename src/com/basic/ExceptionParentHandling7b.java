package com.basic;

public class ExceptionParentHandling7b {

    public static void isException() {
        System.out.println(25/0);
    }

    public static void main(String args[]) throws Exception {
        try {
            isException();
        }
        catch (OutOfMemoryError e) {
            System.out.println("In main - OutOfMemoryError catch: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("In main - ArithmeticException catch: " + e);
            //e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("In main - Exception catch: " + e); //default if all above catch do not match
        }
    }
}
