import java.util.Scanner;


public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicacion Calculadora ****");
        while (true) {
            // mostramos el menú
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
            try {
                System.out.print("Operacion a realizar? ");
                var operacion = Integer.parseInt(consola.nextLine());
                //revisar que este dentro de las opciones
                if (operacion >= 1 && operacion <= 4) {
                    // pidiendo los operandos
                    System.out.print("Proporciona valor operando1: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.print("Proporciona valor operando2: ");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;

                    switch (operacion) {
                        case 1 -> { //suma
                            resultado = operando1 + operando2;
                            System.out.println("Resultado Suma: " + resultado);
                        }
                        case 2 -> { //Resta
                            resultado = operando1 - operando2;
                            System.out.println("Resultado Resta: " + resultado);
                        }
                        case 3 -> { //Multiplicacion
                            resultado = operando1 * operando2;
                            System.out.println("Resultado Multiplicacion: " + resultado);
                        }
                        case 4 -> { //Division
                            resultado = operando1 / operando2;
                            System.out.println("Resultado Division: " + resultado);
                        }
                        default -> {
                            System.out.println("Opcion erronea -> " + operacion);
                        }
                    }
                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea -> " + operacion);
                }
                //imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error -> " + e.getMessage());
            }
        }
    }
}
