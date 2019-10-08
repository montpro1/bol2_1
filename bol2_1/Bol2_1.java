/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_1;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float precioinicial,preciofinal;
        System.out.println("teclee aqui el precio sin descuento del producto");
        
        precioinicial=teclado.nextFloat();
        System.out.println("teclee aqui el precio final del producto");
        preciofinal=teclado.nextFloat();
        float descuento=100-((preciofinal*100)/precioinicial);
        System.out.println("el descuento del producto es " +descuento+ " por ciento");
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
