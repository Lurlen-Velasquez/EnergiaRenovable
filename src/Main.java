//Aqui importamos la libreria que se vaya a manejar

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Se crean los arreglos para la diferentes tipos de energia
        ArrayList<Solar> arraySolar = new ArrayList<>();
        ArrayList<Hidraulica> arrayHidraulica = new ArrayList<>();
        ArrayList<Eolica> arrayEolica = new ArrayList<>();

        while (true) {
            System.out.println("**** Aplicacion Energia Renovable *****");
            // ejecutamos el metodo  menu
            mostrarMenu();
            try {
                var op = sc.nextInt();
                //revisara la opcion mencionada
                if (op >= 1 && op <= 3) {
                    // Ejecutamos el metodo ejecutarMenuEnergia
                    ejecutarMenuEnergia(op, sc, arrayEolica, arrayHidraulica, arraySolar);
                } else if (op == 4) {
                    //cerramos el proceso
                    System.out.println("Finalizar operacion.");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + op);
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es numerico");
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }// fin de try catch
        } //fin del ciclo while
    }//fin del main principal

    public static void mostrarMenu() {
        System.out.println("""
                1. Energia Eolica
                2. Energia Hidraulica
                3. Energia Solar
                4. Sali del menu
                """);
        System.out.print("Por favor, escoja una opción del 1 al 3 ? :");
    }//fin metodo menu


    public static void ejecutarMenuEnergia(int op, Scanner sc, List<Eolica> arrayEolica, List<Hidraulica> arrayHidraulica, List<Solar> arraySolar) {

        switch (op) {
            case 1: { // Energia Eolica - Ingresamos los datos
                System.out.println("----- \n Ingreso de datos de energia eolica \n------");
                String pais = ingresarPais(sc);
                int año = ingresarAño(sc);
                double produccion = ingresarProduccion(sc);
                double consumo = ingresarConsumo(sc);
                int numeroturbinas = ingresarCatidadTurbinas(sc);

                // instanciamos el objeto
                var eolica = new Eolica("Eolica", pais, año, produccion, consumo, numeroturbinas);
                System.out.println("----- \n Mostrar informacion  \n------");
                // se invoca el metodo
                eolica.obtenerBalanceEolica(numeroturbinas);
                // aqui estamos agregando elementos al arreglo
                arrayEolica.add(eolica);
                // Mostra informacion el arreglo que estamos llegando con un ciclo
                System.out.println("----- \n Mostrar informacion de los elementos \n------");
                System.out.println("El listado tiene: " + arrayEolica.size() + " elementos");
                for (Eolica e : arrayEolica) {
                    System.out.print(e + "\n");
                }
                break;
            }
            case 2: { // Energia Hidraulica // Ingresamos los datos
                System.out.println("----- \n Ingreso de datos de energia  hidraulica \n------");
                String pais = ingresarPais(sc);
                int año = ingresarAño(sc);
                double produccion = ingresarProduccion(sc);
                double consumo = ingresarConsumo(sc);
                double volumenAgua = ingresarVolumenAgua(sc);

                // instanciamos el objeto
                var hidraulica = new Hidraulica("Hidraulica", pais, año, produccion, consumo, volumenAgua);
                System.out.println("----- \n Mostrar informacion  \n------");
                // se invoca el metodo
                hidraulica.obtenerBalanceHidraulico(volumenAgua);
                // aqui estamos agregando elementos al arreglo
                arrayHidraulica.add(hidraulica);
                // Mostra informacion el arreglo que estamos llegando con un ciclo
                System.out.println("----- \n Mostrar informacion de los elementos \n------");
                System.out.println("El listado tiene: " + arrayHidraulica.size() + " elementos");
                for (Hidraulica e : arrayHidraulica) {
                    System.out.print(e + "\n");
                }
                break;
            }
            case 3: { // Energia Solar // Ingresamos los datos
                System.out.println("----- \n Ingreso de datos de energia solar \n ------");
                String pais = ingresarPais(sc);
                int año = ingresarAño(sc);
                double produccion = ingresarProduccion(sc);
                double consumo = ingresarConsumo(sc);
                int cantidadPaneles = ingresarCatidadPaneles(sc);

                // instanciamos el objeto
                var solar = new Solar("Solar", pais, año, produccion, consumo, cantidadPaneles);
                System.out.println("----- \n Mostrar informacion  \n------");
                // se invoca el metodo
                solar.obtenerBalanceSolar(cantidadPaneles);
                // aqui estamos agregando elementos al arreglo
                arraySolar.add(solar);
                // Mostra informacion el arreglo que estamos llegando con un ciclo
                System.out.println("----- \n Mostrar informacion de los elementos \n------");
                System.out.println("El listado tiene: " + arraySolar.size() + " elementos");
                for (Solar e : arraySolar) {
                    System.out.print(e + "\n");
                }
                break;
            }
            default:
                System.out.println("Opcion equivocada: " + op);
        }//fin del switch
    }// fin metodo ejecutarMenuEnergia

    // Funciones

    private static String ingresarPais(Scanner sc) {
        System.out.println("Ingresar el pais: ");
        String pais1 = sc.next();
        return pais1;
    }

    private static int ingresarAño(Scanner sc) {
        System.out.println("Ingresar el año: ");
        String año = sc.next();
        return Integer.parseInt(año);
    }

    private static double ingresarProduccion(Scanner sc) {
        System.out.println("Ingresar la producción: ");
        String produccion = sc.next();
        return Double.parseDouble(produccion);
    }

    private static double ingresarConsumo(Scanner sc) {
        System.out.println("Ingresr el consumo: ");
        String consumo = sc.next();
        return Double.parseDouble(consumo);
    }

    private static int ingresarCatidadTurbinas(Scanner sc) {
        System.out.println("Ingresar la cantidad de turbinas: ");
        String turbinas = sc.next();
        return Integer.parseInt(turbinas);
    }

    private static int ingresarCatidadPaneles(Scanner sc) {
        System.out.println("Ingresar la cantidad de paneles: ");
        String paneles = sc.next();
        return Integer.parseInt(paneles);
    }

    private static double ingresarVolumenAgua(Scanner sc) {
        System.out.println("Ingresar el volumen del agua: ");
        String volumenAgua = sc.next();
        return Double.parseDouble(volumenAgua);
    }

}//fin de la clase


