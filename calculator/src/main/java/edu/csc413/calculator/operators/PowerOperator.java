package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

    @Override
    public int priority() {
        return 3;
    }


    @Override
    public Operand execute(Operand op1, Operand op2) {


        double opD1 = op1.getValue();
        double opD2 = op2.getValue();

        int pow = (int)(Math.pow(opD1,opD2));

        // return Operand object

        Operand newOperand = new Operand(pow);

        return newOperand;

    }
}
