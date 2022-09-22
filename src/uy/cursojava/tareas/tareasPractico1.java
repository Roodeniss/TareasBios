/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uy.cursojava.tareas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class tareasPractico1 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String entradaTxt = "";
        Integer opc = 0;
        Boolean entradaCorrecta = true;
        System.out.println("Ingrese el numero del ejercicio a probar [1-5] o 6 para terminar el proceso");
        entradaTxt = entrada.nextLine();
        while (entradaCorrecta) {
            try {
                opc = Integer.parseInt(entradaTxt);
                entradaCorrecta = false;
                while (opc != 6) {
                    switch (opc) {
                        case 1:
                            System.out.println("Ingreso al ejercicio: 1\n");
                            ejercicio1();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 2:
                            System.out.println("Ingreso al ejercicio: 2\n");
                            ejercicio2();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 3:
                            System.out.println("Ingreso al ejercicio: 3 \n");

                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 4:
                            System.out.println("Ingreso al ejercicio: 4 \n");
                            ejercicio4();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 5:
                            System.out.println("Ingreso al ejercicio: 3 \n");

                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;

                        case 6:
                            System.exit(0);
                            break;
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Vuelva a ingresar un numero del menu\n");
                entradaTxt = entrada.nextLine();
            }
        }
    }

    public static void ejercicio1() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio2() {
        String salida = "*";
        System.out.println(salida);
        for (int i = 0; i < 10; i++) {
            salida += "*";
            System.out.println(salida);
        }
    }

    public static void ejercicio3() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaActual = new Date();

    }

    public static void ejercicio4() {
        String usuario = "";
        Integer random = (int) Math.floor(Math.random() * (5000 - 1000 + 1)) + 1000;
        Integer num = 0;
        Boolean esIgual = false;
        Integer cant = 1;
        String numTxt = "";
        System.out.println(random);
        System.out.println("Ingrese un numbre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese un numero entre 1000 y 5000");
        System.out.println("Ingrese numero: ");
        numTxt = entrada.nextLine();
        while (!esIgual) {
            try {
                num = Integer.parseInt(numTxt);
                if (num.equals(random)) {
                    esIgual = true;
                } else {
                    if (num > random) {
                        cant++;
                        System.out.println("Ingrese un numero menor: ");
                        numTxt = entrada.nextLine();
                    } else if (num < random) {
                        cant++;
                        System.out.println("Ingrese un numero mayor: ");
                        numTxt = entrada.nextLine();
                    }
                }
            } catch (NumberFormatException e) {
                cant++;
                System.out.println("Debe ingresar un numero!!");
                numTxt = entrada.nextLine();
                num = Integer.parseInt(numTxt);
            }
        }
        if (esIgual) {
            Integer puntaje = 1000 / cant;
            System.out.println("Felicitaciones! Ganaste " + puntaje);
            String txt = "<" + usuario + ">:<" + puntaje + ">";
            try {
                Path filePath = Paths.get("puntaje.txt");
                //escribo el contenido en el archivo
                Files.writeString(filePath, txt);
                String contenido = Files.readString(filePath);
                // verifico el contenido del archivo
                System.out.println(contenido);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
