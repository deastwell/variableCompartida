package org.example;

public class Main {
    public static void main(String[] args) {
        VariableCompartida variable = new VariableCompartida(0);

        // Hebra para modificar la variable
        Thread hebraModificadora = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                variable.setVariable(i); // Modifica la variable de 0 a 99
                try {
                    Thread.sleep(100); // Simula un proceso que lleva tiempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Hebra para mostrar los cambios en la variable
        Thread hebraMostradora = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                int valor = variable.getVariable(); // Obtiene el valor actual
                System.out.println("Cambio en la VariableCompartida: " + valor);
                try {
                    Thread.sleep(100); // Simula un proceso que lleva tiempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        hebraModificadora.start();
        hebraMostradora.start();

        try {
            hebraModificadora.join();
            hebraMostradora.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}