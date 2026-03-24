package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExamples {

        // Método que provoca una excepción aritmética
        public void ejemploDivisionPorCero() {
          try {
                int resultado = 10 / 0; // Provoca ArithmeticException
                System.out.println("Resultado: " + resultado);
           } catch (ArithmeticException ex) {
                System.out.println("Error: División por cero no permitida.");
            } finally {
                System.out.println("Bloque finally ejecutado siempre.");
            }
        }

        // Método que lanza una excepción checked
        public void ejemploCheckedException() throws IOException {
            FileReader fr = new FileReader("archivo_inexistente.txt");
            fr.close();
        }

        // Excepción personalizada

        // Método que usa excepción personalizada
        public void validarEdad(int edad) throws EdadInvalidaException {
            if (edad < 18) {
                throw new EdadInvalidaException("La edad debe ser mayor o igual a 18.");
            } else {
                System.out.println("Edad válida: " + edad);
            }
        }

        // Ejemplo de try-with-resources
        public void ejemploTryWithResources() {
            try (java.io.FileWriter fw = new java.io.FileWriter("salida.txt")) {
                fw.write("Ejemplo de try-with-resources.");
                System.out.println("Archivo escrito correctamente.");
            } catch (java.io.IOException e) {
                System.out.println("Error al escribir el archivo: " + e.getMessage());
            }
        }




}
