package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PremiosRecompensas premios = new PremiosRecompensas();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        System.out.println("Vamos a agregar empleados!");
        do{
            premios.registrarNuevoEmpleado();
            System.out.print("¿Desea agregar más empleados? (1=si, 0=no) ");
            op = Utilitaria.getInt();
        }while(op!=0);

        System.out.println("Veamos la lista de empleados: ");
        premios.listarEmpleados();
    }
}
