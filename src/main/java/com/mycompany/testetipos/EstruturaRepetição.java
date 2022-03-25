/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testetipos;

public class EstruturaRepetição {
    public static void main(String[] args) {
        
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;              
            }
            if ( cc == 8) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
        
        
    }
}