/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method03;
import java.util.Scanner;
/**
 *
 * @author El-Savira
 */
public class Method03 {
    public static void main(String[] args) {
        int I, II, III, NilaiTerbesar;
        Scanner baca = new Scanner(System.in);
        
        //Input
        System.out.println("=====Menentukan Nilai Terbesar=====");
        System.out.println("Masukkan Bilangan I : ");
        I = baca.nextInt();
        System.out.println("Masukkan Bilangan II : ");
        II = baca.nextInt();
        System.out.println("Masukkan Bilangan III : ");
        III = baca.nextInt();
        
        //Proses
        if (III >= I)
            System.out.println("Nilai Terbesar Adalah :" + III);
        else if (III >= II)
            System.out.println("Nilai Terbesar Adalah :" + III);
        else if (II >= III)
            System.out.println("Nilai Terbesar Adalah :" + II);
        else if (II >= I)
            System.out.println("Nilai Terbesar Adalah :" + II);
        else if (I >= II)
             System.out.println("Nilai Terbesar Adalah :" + I);
        else if (I >= III)
            
        //Output
             System.out.println("Nilai Terbesar Adalah :" + I);
        System.out.println("==================");
        System.out.println("Program Selesai...");
        
        
    }
    
}
