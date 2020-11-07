/*
    Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array, 
    posteriormente que calcule y muestre el promedio de los valores
    positivos y  de los negativos.
    :3
*/
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int dato = 0;
        double pro = 0.00;
        int num [] = new int [10];
        System.out.println("Dame el primer valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[0] = dato;
        System.out.println("Dame el segundo valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[1] = dato;
        System.out.println("Dame el tercer valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[2] = dato;
        System.out.println("Dame el cuarto valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[3] = dato;
        System.out.println("Dame el quinto valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[4] = dato;
        System.out.println("Dame el sexto valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[5] = dato;
        System.out.println("Dame el septimo valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[6] = dato;
        System.out.println("Dame el octavo valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[7] = dato;
        System.out.println("Dame el noveno valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[8] = dato;
        System.out.println("Dame el decimo valor no importa que sean negativos o positivos");
        dato = in.nextInt();
        num[9] = dato;
       
        System.out.println("El promedio de tus numeros es de");
        pro = num[0] +  num[1] +  num[2] +  num[3] +  num[4] +  num[5] +  num[6] +  num[7] + num[8] +  num[9];
        pro /= 10;
        System.out.println(""+pro+"");
     
    }
}