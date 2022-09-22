package uy.cursojava.tareas;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Rodrigo
 */
public class TareaMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

}
