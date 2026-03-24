package execution;

import exceptions.EdadInvalidaException;
import exceptions.ExceptionExamples;

import static exceptions.ExceptionExamples.*;

public class Principal {
    public static void main(String[] args) {

        ExceptionExamples exception01 = new ExceptionExamples();

        System.out.println("=== Ejemplo 1: try-catch-finally ===");
        exception01.ejemploDivisionPorCero();


        System.out.println("\n=== Ejemplo 2: Propagación de excepciones checked ===");

        try {
            exception01.ejemploCheckedException();
        } catch (java.io.IOException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        System.out.println("\n=== Ejemplo 3: Excepción personalizada ===");
        try {
            exception01.validarEdad(15);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        }

        System.out.println("\n=== Ejemplo 4: try-with-resources ===");
            exception01.ejemploTryWithResources();


    }
}