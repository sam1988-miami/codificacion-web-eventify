/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

   
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        List<Administrador_plataforma> admin = new ArrayList<>();
        
        System.out.println("---------bienvenido al sistema---------");
        System.out.println("¿Cuántos registros deseas guardar?");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Registro " + (i + 1) + " ---");

            System.out.print("Personalizar página: ");
            String personalizar = sc.nextLine();

            System.out.print("Ingreso dashboard: ");
            String ingresoDash = sc.nextLine();

            System.out.print("Ingreso sistema: ");
            String ingresoSis = sc.nextLine();

            System.out.print("Gestión de evento: ");
            String gestion = sc.nextLine();

            System.out.print("Aprobar evento: ");
            String aprobar = sc.nextLine();

            System.out.print("Resolución de problemas: ");
            String resolver = sc.nextLine();

            admin.add(new Administrador_plataforma(
                    personalizar,
                    ingresoDash,
                    ingresoSis,
                    gestion,
                    aprobar,
                    resolver
            ));
        }

        System.out.println("----------informacion actualizada----------");

        for (Administrador_plataforma adm : admin) {
            System.out.println("\n--- Registro ---");
            System.out.println("Personalizar: " + adm.getPersonalizar_pagina());
            System.out.println("Ingreso dashboard: " + adm.getIngreso_dashboard());
            System.out.println("Ingreso sistema: " + adm.getIngreso_sistema());
            System.out.println("Gestión evento: " + adm.getGestion_evento());
            System.out.println("Aprobar evento: " + adm.getAprobar_evento());
            System.out.println("Resolución problemas: " + adm.getResolucion_problemas());
        }

        sc.close();
    }
}

