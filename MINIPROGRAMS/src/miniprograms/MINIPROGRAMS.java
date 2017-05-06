/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprograms;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC_HP
 */
public class MINIPROGRAMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //--------------------------------------------------------------------------
      Scanner sc=new Scanner (System.in);
       System.out.println("ingresa un numero:");
        int a=sc.nextInt();
        
        
        if (a%2==0){
        System.out.println(a+" es par");
        }else;
        System.out.println(a+ " es impar");
      /*
       int n=4;
        JOptionPane.showInputDialog("el juego consiste en adivinar un numero:");
        int x=n;
                JOptionPane.showInputDialog( "digite un numero:");
        if (x>n){    
           System.out.println("el numero es inferior"); 
        }
        else if(x<n){
            System.out.println("el numero es mayor");
        }
            if (x==n){
                System.out.println("ADIVINASTE!");
       //------------------------------------------------------------------------------
            }*/
        /*int aleatorio=(int)(Math.random()*100) ;
          int numero=0;
          int intentos=0;
          do{
              intentos ++;
              numero =Integer.parseInt(JOptionPane.showInputDialog("ingrese numero:"));
              
              if(aleatorio<numero){
                  JOptionPane.showMessageDialog(null,"ingrese uno mas bajo");
              } else if (aleatorio>numero){
                  JOptionPane.showMessageDialog(null,"Ingrese uno mas alto");
              }}
              while (numero!=aleatorio);
                  JOptionPane.showMessageDialog(null,"adivinaste");*/
        //-------------------------------------------------------------------------------
        /*//para sistema binariooo
            Scanner scanner=new Scanner(System.in);
            System.out.print("Ingrese un valor entero: ");
           int v = scanner.nextInt();
          System.out.println("Valor Ingresado: "+v);
          System.out.println("binario = "+Integer.toBinaryString(v));
          System.out.println("octal = "+Integer.toOctalString(v));
          System.out.println("hexadecimal = "+Integer.toHexString(v));
          System.out.print("Ingrese una base numerica: ");
            int b = scanner.nextInt();
           String sBaseN=Integer.toString(v,b);
          System.out.println(v + " en base("+b+") = " + sBaseN);*/
        
        //----------------------------------------------------------------------------------
        /*
        int contador=0;
              do{
                  System.out.println("CERES MOGOTES"+((contador+1)));
                  contador +=1;
              }
              while (contador<100);*/
        //-------------------------------------------------------------------------
        /*Scanner teclado=new Scanner (System.in);
        int lado;
        int superficie;
        System.out.print("ingrese valor del lado del cuadrado:");
        lado=teclado.nextInt();
        superficie=lado*lado;
        System.out.print("La superficie del cuadrado es:");
        System.out.print(superficie);*/
        
        //--------------------------------------------------------------------------------
        /*
        Scanner teclado=new Scanner(System.in);
        int Nota1,Nota2,Nota3;
        
        System.out.print("Ingrese la primer nota:");
        
        Nota1 =teclado.nextInt();
        
        System.out.print("Ingrese segunda nota:");
        Nota2 =teclado.nextInt();
        
        System.out.print("ingrese tercera nota:");
        Nota3 =teclado.nextInt();
        int promedio;
        promedio=(Nota1 + Nota2 + Nota3)/3;
        
        if(promedio>=35){
            System.out.print("PROMOCIONADO");
        }
         */
        
        //------------------------------------------------------------------
        
        
        int i=5;
        int j = 9;
        
        if (i==j){
            System.out.println("A");
        }
        else if ((i%j)<3){
            System.out.println("B");
        }
        else if(i<(j-1)){
            System.out.println("C");
        }
        else{
           System.out.println("D"); 
        }
        
        
        
        
        
        
        
        
        
        
        
    }  }


        
        