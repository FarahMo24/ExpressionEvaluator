package edu.csc413.calculator.evaluator;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    /**
     * construct operand from string token.
     */

    //private String token;
    private int value;

    public Operand(String token) {

        this.value = Integer.parseInt(token);
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;

    }

    /**
     * return value of operand
     */
    public int getValue() {
        return this.value;

    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {

        // try and catch block to test if it's an integer
        try {

            Integer.parseInt(token);

        } catch(NumberFormatException e) {

            return false;

        } catch(NullPointerException e) {

            return false;
        }

        return true;
    }
}
