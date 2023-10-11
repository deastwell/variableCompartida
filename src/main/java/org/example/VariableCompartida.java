package org.example;

public class VariableCompartida {

    private int variable;

    public VariableCompartida(int variable){
        this.variable= variable;

    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }

    public void inc(){
        variable++;
    }
}