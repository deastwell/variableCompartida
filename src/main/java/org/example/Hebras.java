package org.example;

public class Hebras implements Runnable{

    private VariableCompartida variable;
    public Hebras(VariableCompartida variable){
        this.variable = variable;
    }

    @Override
    public void run() {
        for (int i = 0; i<=10;i++){
            variable.inc();
            System.out.println(variable.getVariable());

        }

    }
}
