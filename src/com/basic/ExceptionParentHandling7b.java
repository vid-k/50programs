package com.basic;

//7. Exceptions.
//b. Write a program containing a function which is expected to throw any kind of exception
// say NullPointerException or ArithmeticException etc and then handle this function in the parent function which calls this function.

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
