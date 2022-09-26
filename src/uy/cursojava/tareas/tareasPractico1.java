/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uy.cursojava.tareas;

import uy.cursojava.tareas.Tareas;

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
        Tareas t = new Tareas();
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
                            System.out.println("Ingreso a la tarea3: \n");
                            t.tarea3();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 2:
                            System.out.println("Ingreso a la tarea 4: \n");
                            t.tarea4();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 3:
                            System.out.println("Ingreso a a tarea 5:\n");
                            t.tarea5();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 4:
                            System.out.println("Ingreso a la tarea meses: \n");
                            t.tareaMeses();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 5:
                            System.out.println("Ingreso al ejercicio 1: \n");
                            t.ejercicio1();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 6:
                            System.out.println("Ingreso al ejercicio 2: \n");
                            t.ejercicio2();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 7:
                            System.out.println("Ingreso al ejercicio 3: \n");
                            t.ejercicio3();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 8:
                            System.out.println("Ingreso al ejercicio 4: \n");
                            t.ejercicio4();
                            entradaCorrecta = true;
                            System.out.println("-----------------------------------------\n"
                                    + "Ingrese el numero de la tarea a ejecutar\n "
                                    + "¤ [1-3] Para ejecutar las tareas\n"
                                    + "¤ 4 Para ejecutar tarea Meses\n"
                                    + "¤ [5-8] Para ejecutar Practico 1\n"
                                    + "¤ 9 Terminar el proceso\n"
                                    + "-----------------------------------------");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 9:
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

}
