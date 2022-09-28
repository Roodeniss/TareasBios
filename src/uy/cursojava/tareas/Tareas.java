/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.tareas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Tareas {

    Scanner entrada = new Scanner(System.in);

    public void tarea3() {
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la direccion");
        String direc = entrada.nextLine();
        System.out.println("Ingrese la edad");
        String edadTxt = entrada.nextLine();
        Integer edad = 0;
        String txtEdad = "";
        Boolean entradaCorrecta = true;
        while (entradaCorrecta) {
            try {
                edad = Integer.parseInt(edadTxt);
                entradaCorrecta = false;
                if (edad >= 18) {
                    txtEdad = "Mayor de Edad\n";
                } else {
                    txtEdad = "Menor de edad\n";
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Vuelva a ingresar la Edad\n"
                        + "solo se admiten numeros");
                edadTxt = entrada.nextLine();
            }
        }
        System.out.println("Nombre: " + nombre + "\n"
                + "----------------------------\n"
                + "Apellido: " + apellido + "\n"
                + "----------------------------\n"
                + "Dirección: " + direc + "\n"
                + "----------------------------\n"
                + txtEdad);
    }

    public void tarea5() {
        /*Inicio de variables*/
        Integer mes = 0;
        String mesString = "";
        String hemis = "";
        String estación = "";
        String mesTxt = "";
        Boolean entradaCorrecta = true;
        /*Fin de varialbes*/
        System.out.println("Entre el valor del mes [1-12]");
        mesTxt = entrada.nextLine();
        while (entradaCorrecta) {
            try {//se verifica si la entrada de mes es de forma Interger
                entradaCorrecta = false;
                mes = Integer.parseInt(mesTxt);
                if (mes > 12) {
                    entradaCorrecta = true;
                    System.out.println("El mes debe ingresarse del 1 al 12");
                    mesTxt = entrada.nextLine();
                }
                switch (mes) {
                    case 1:
                        mesString = "Enero";
                        break;
                    case 2:
                        mesString = "Febrero";
                        break;
                    case 3:
                        mesString = "Marzo";
                        break;
                    case 4:
                        mesString = "Abril";
                        break;
                    case 5:
                        mesString = "Mayo";
                        break;
                    case 6:
                        mesString = "Junio";
                        break;
                    case 7:
                        mesString = "Julio";
                        break;
                    case 8:
                        mesString = "Agosto";
                        break;
                    case 9:
                        mesString = "Septiembre";
                        break;
                    case 10:
                        mesString = "Octubre";
                        break;
                    case 11:
                        mesString = "Noviembre";
                        break;
                    case 12:
                        mesString = "Diciembre";
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("El mes debe ingresarse del 1 al 12");
                mesTxt = entrada.nextLine();
            }
        }
        System.out.println("Entre N para hemisferio Norte o S para hemisferio Sur");
        hemis = entrada.nextLine();
        Boolean hemisErroneo = true;
        while (hemisErroneo) {
            if (hemis.equalsIgnoreCase("N")) {
                hemis = "NORTE";
                hemisErroneo = false;
            } else if (hemis.equalsIgnoreCase("S")) {
                hemis = "SUR";
                hemisErroneo = false;
            } else {
                System.out.println("Entrada invalida, ingrese una S o una N");
                hemis = entrada.nextLine();
            }
        }
        if (hemis.equalsIgnoreCase(
                "Norte")) {
            if (mes >= 1 && mes <= 3) {
                estación = "INVIERNO";
            }
            if (mes >= 4 && mes <= 6) {
                estación = "PRIMAVERA";
            }
            if (mes >= 7 && mes <= 9) {
                estación = "VERANO";
            }
            if (mes >= 10 && mes <= 12) {
                estación = "OTOÑO";
            }
        } else if (hemis.equalsIgnoreCase(
                "Sur")) {
            if (mes >= 1 && mes <= 3) {
                estación = "VERANO";
            }
            if (mes >= 4 && mes <= 6) {
                estación = "OTOÑO";
            }
            if (mes >= 7 && mes <= 9) {
                estación = "PRIMAVERA";
            }
            if (mes >= 10 && mes <= 12) {
                estación = "INVIERNO";
            }
        }
        String salida = "La estación correspondiente al mes de " + mesString.toUpperCase() + " del hemisferio "
                + hemis + " es " + estación;
        System.out.println(salida);
    }

    public void tarea4() {
        System.out.println("¿Que lentes deas comprar?\n"
                + "Los tipos puede ser: multifocal, monofocal");
        String tipo = entrada.nextLine();
        String retorno = "Usted eligio: ";
        Boolean tipoOk = false;
        Boolean entradaOk = true;
        String diseño = "";
        while (!tipoOk) {
            if (tipo.equalsIgnoreCase("multifocal")) {
                tipoOk = true;
                retorno += " multifocal";
                System.out.println("Elija uno de los 3 diseños disponibles:\n"
                        + "1- Diseño 1\n"
                        + "2- Diseño 2\n"
                        + "3- Diseño 3\n");
                while (entradaOk) {
                    diseño = entrada.nextLine();
                    if (diseño.equalsIgnoreCase("1")) {
                        diseño = "Diseño 1";
                        entradaOk = false;
                    } else if (diseño.equalsIgnoreCase("2")) {
                        entradaOk = false;
                        diseño = "Diseño 2";
                    } else if (diseño.equalsIgnoreCase("3")) {
                        entradaOk = false;
                        diseño = "Diseño 3";
                    } else {
                        System.out.println("Ingrese un diseño valido [1-3]\n");
                    }
                }
                retorno += " " + diseño;
            } else if (tipo.equalsIgnoreCase("monofocal")) {
                tipoOk = true;
                retorno += " monofocal";
                System.out.println("¿Desea sus lentes con o sin antireflejo?");
                tipo = entrada.nextLine();
                Boolean entradaValida = true;
                while (entradaValida) {
                    if (!tipo.equalsIgnoreCase("sin antireflejo") && !tipo.equalsIgnoreCase("con antireflejo")) {
                        System.out.println("Debe elegir si desea con o sin antireflejo");
                        tipo = entrada.nextLine();
                    } else {
                        if (tipo.equalsIgnoreCase("con antireflejo")) {
                            retorno += " con antireflejo";
                            entradaValida = false;
                        } else if (tipo.equalsIgnoreCase("sin antireflejo")) {
                            retorno += " sin antireflejo";
                            entradaValida = false;
                        }
                    }
                }
            } else {
                System.out.println("Debe de ingresar un tipo de lentes correcto");
                tipo = entrada.nextLine();
            }
        }
        if (tipoOk) {
            System.out.println(retorno);
        }
    }

    public void tareaMeses() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ArrayList<String> mesesArray = new ArrayList();
        mesesArray.add("Enero");
        mesesArray.add("Febrero");
        mesesArray.add("Marzo");
        mesesArray.add("Abril");
        mesesArray.add("Mayo");
        mesesArray.add("Junio");
        mesesArray.add("Julio");
        mesesArray.add("Agosto");
        mesesArray.add("Septiembre");
        mesesArray.add("Octubre");
        mesesArray.add("Noviembre");
        mesesArray.add("Diciembre");

        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + " \n");
        }
        System.out.println(" -----------------------------------------------------\n");
        for (int i = 0; i < mesesArray.size(); i++) {
            System.out.println(mesesArray.get(i) + " \n");
        }
    }

    public void ejercicio1() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void ejercicio2() {
        String salida = "*";
        System.out.println(salida);
        for (int i = 0; i < 10; i++) {
            salida += "*";
            System.out.println(salida);
        }
    }

    public void ejercicio3() {

    }
String txt = "";
    public void ejercicio4() {
        
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
            txt += "<" + usuario + ">:<" + puntaje + ">\n";
            try {
                //escribo el contenido en el archivo
                PrintStream archivo = new PrintStream("C:\\Users\\Rodrigo\\Documents\\NetBeansProjects\\TareasBios\\puntaje.txt");

                archivo.println(txt);
                // verifico el contenido del archivo
            } catch (FileNotFoundException ex) {
                System.out.println("entra");
            }
        }
    }

}
