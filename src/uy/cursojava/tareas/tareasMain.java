package uy.cursojava.tareas;

/**
 *
 * @author Rodrigo
 */
import java.util.Scanner;

public class tareasMain {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String entradaTxt = "";
        Integer opc = 0;
        Boolean entradaCorrecta = true;
        System.out.println("Ingrese el numero de la tarea a ejecutar:[1-3] o 4 para terminar el proceso");
        entradaTxt = entrada.nextLine();
        while (entradaCorrecta) {
            try {
                opc = Integer.parseInt(entradaTxt);
                entradaCorrecta = false;
                while (opc != 4) {
                    switch (opc) {
                        case 1:
                            System.out.println("Ingreso a tarea 3: \n");
                            tarea3();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 2:
                             System.out.println("Ingreso a tarea 4: \n");
                            tarea4();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 3:
                             System.out.println("Ingreso a tarea 4.1: \n");
                            tarea5();
                            entradaCorrecta = true;
                            System.out.println("Ingrese el numero de la tarea a ejecutar [1-3] o 4 para terminar el proceso\n");
                            entradaTxt = entrada.nextLine();
                            opc = Integer.parseInt(entradaTxt);
                            break;
                        case 4:
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

    public static void tarea3() {
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

    public static void tarea4() {
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

    public static void tarea5() {
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

}
