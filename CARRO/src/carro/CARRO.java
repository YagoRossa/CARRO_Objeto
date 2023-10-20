/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;

import carros.Carro;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CARRO {

    final static Scanner LER = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        Carro carro1 = new Carro();
        
        carro1 = lerCarro(carro1);
        
        System.out.println(carro1.toString());
    }
    
    public static Carro lerCarro(Carro c){
        
        System.out.println("id:");
        c.setIdCarro(LER.nextInt());
        
        System.out.println("Nome");
        c.setNome(LER.next());
        
        System.out.println("Marca");
        c.setMarca( LER.next());
        
        System.out.println("Potência");
        c.setPotencia( LER.nextInt());
        
        System.out.println("Ano");
        c.setAno( LER.nextInt());
        
        return c;
    }
    
}
