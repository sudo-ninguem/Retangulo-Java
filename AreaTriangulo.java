package aula06;

import java.util.Scanner;

public class AreaTriangulo {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double base, altura, area, perimetro, diagonal;  

    System.out.println("Digite a altura do Retangulo: ");
    altura = sc.nextDouble(); 

    System.out.println("Digite a base do Retangulo: ");
    base = sc.nextDouble(); 

    area = base * altura; 
    perimetro = 2 *  (base + altura); 
    diagonal = Math.sqrt((base * base) + (altura * altura )) ;

    System.out.println();

    System.out.println("O resultado do Retangulo é: ");

    System.out.println("Altura = " + altura);
    System.out.println("Base = " + base);
    System.out.println("Area = " + area);
    System.out.println("Perimentro = " + perimetro);
    System.out.println("Diagonal = " + diagonal);





    sc.close(); 
    
}

    
}