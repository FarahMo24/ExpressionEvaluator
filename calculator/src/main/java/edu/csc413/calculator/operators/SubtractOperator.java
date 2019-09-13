package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class SubtractOperator extends Operator {

    @Override
    public int priority() {
        return 1;
    }


    @Override
    public Operand execute(Operand op1, Operand op2) {


        int difference = op1.getValue() - op2.getValue();

        // return Operand object

        Operand newOperand = new Operand(difference);

        return newOperand;

    }
}
