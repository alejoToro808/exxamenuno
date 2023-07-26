package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        
        String nombreUsuario;
        int puntajeCredito;
        byte edad;
        short numeroUsosTarjeta;
        int totalPesosProductoAseo;
        int totalPesosAlimentos;
        int totalPesosOtros;
        
        
        
        //INICIANDO SCANER
        Scanner teclado =new Scanner(System.in);
        
        //iNICIANDO VARIABLES
        System.out.println("****Bienvenido Alkomprar****");
        System.out.print("Para continuar digite: ");
        System.out.print("Nombre: ");
        nombreUsuario= teclado.nextLine();
        System.out.print("Digita el puntaje de tu tarjeta de credito aqui: ");
        puntajeCredito= teclado.nextInt();
        System.out.print("Edad: ");
        edad= teclado.nextByte();
        System.out.print("Digite su gasto mensual en productos de aseo: ");
        totalPesosProductoAseo= teclado.nextInt();
        System.out.print("Digite su gasto mensual en alimentacion: ");
        totalPesosAlimentos= teclado.nextInt();
        System.out.print("Digite su gasto mesual en otros productos: ");
        totalPesosOtros= teclado.nextInt();
        
        //PROCESO
        double totalCuenta=totalPesosAlimentos+totalPesosOtros+totalPesosProductoAseo;
        System.out.println("**El total de su cuenta es: " +totalCuenta);
        
        double porcentaje;
        if (puntajeCredito==1){
            porcentaje = 0.25;
        } else if (puntajeCredito==2) {
            porcentaje = 0.20;
        } else if (puntajeCredito==3) {
            porcentaje = 0.15;
        } else if (puntajeCredito==4) {
            porcentaje = 0.1;
        } else if (puntajeCredito >=5 && puntajeCredito <=9) {
            porcentaje = 0;
            System.out.println("No posees descuento");
        }else {
            System.out.println(" Extacto Invalido");
            return;
        }

        double desccuento=totalCuenta*porcentaje;
        double totalPagar=totalCuenta-desccuento;

        System.out.println(" Tu descuento es de: "+desccuento);
        System.out.println("Señor " +nombreUsuario+" el total de su cuenta es: "+ totalPagar);

    }
}