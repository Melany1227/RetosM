package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 0;
        String color;

        do{
            System.out.println("Ingrese la cantidad de equipos participantes en el torneo");
            n = sc.nextInt();
        } while (n<2 && n >30);

        int uniforme [][] = new int[n][2];

        int local;
        int visitante;
        String[] parts;
        for (int i=0;i<n;i++){
            do{
                System.out.println("Ingrese el color del uniforme del equipo " + (i+1) + " local(1) y visitante(2) (Separados por un espacio: <1> <2>)");
                color = sc.next();
                parts = color.split("-");
                local = Integer.parseInt((parts[0]));
                visitante = Integer.parseInt((parts[1]));
            }while((local >= 100 && local < 0) && (visitante >= 100 && visitante < 0));
            for (int j=0; j<2; j++){
                uniforme[i][j] = Integer.parseInt((parts[j]));
            }
        }
        int cont = 0;
        for (int i=0;i<n;i++){
            int t = uniforme[i][0];
            for (int j=0; j<n; j++){
                int o = uniforme[j][1];
                if (t == o){
                    cont = cont + 1;
                }
            }
        }
        System.out.println(cont);
    }
}