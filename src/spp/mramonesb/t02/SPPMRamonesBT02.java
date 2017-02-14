/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.t02;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    System.out.println("Calculador de salario");
    Scanner kb= new Scanner (System.in);
     // variables
    double sue, op;
    int cate = 0; 
    int he, opEntrada;
    //Menu 
    System.out.println("Selecciona tu menu");
    System.out.println("1. Categoria 1");
    System.out.println("2. Categoria 2");
    System.out.println("3. Categoria 3");
    System.out.println("4. Categoria 4");
    System.out.println("5. Categoria 5");
    System.out.println("6. Categoria 6");
    System.out.println("7. Categoria 7");
    System.out.println("8. Categoria 8");
    
    //paso 3 opereciones 
    cate= kb.nextInt();
    if (cate>=1 && cate<=8){
        
    switch (cate){
        case 1:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*30);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 2:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*38);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 3:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*50);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 4:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*70);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 5:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*75);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 6:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*80);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 7:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*85);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
            
        case 8:
            System.out.println("Introducir sueldo ");
            sue= kb.nextDouble();
            System.out.println("Introducir hora trabajadas");
            he= kb.nextInt();
            op=sue+(he*90);
            System.out.println("Tu salario por las horas extras trabajadas es $" + op);
            break;
                   
            }
                    
            }
    else {
        System.out.println("No contamos con esa categoria");
    }  
        
    }
    }
    

