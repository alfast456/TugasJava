/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> pq = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        Scanner makanan = new Scanner(System.in);
        Scanner away = new Scanner(System.in);
        boolean keepLooping = true;
        int i = 0;
        do {
            
            System.out.println("silahkan pilih antrean");
            System.out.println("==========================");
            System.out.println("1. Antrean Dine In");
            System.out.println("2. Antrean Take Away");
            System.out.println("3. Exit");
            System.out.println("==========================");
            System.out.println("Pilihan 1/2/3 : ");
            int nav = input.nextInt();
            
            
            switch(nav){
                case 1:
                    System.out.println("Masukkan pesanan : ");
                    pq.add(makanan.nextLine());
                    System.out.println("===DAFTAR ANTREAN DINE IN===");
                    System.out.println("Customer : " + i);
                    System.out.println("Nama ke : " + pq.poll());
                    System.out.println("============================");
                    break;
                    
                case 2:
                    System.out.println("Masukkan pesanan : ");
                    pq.add(away.nextLine());
                    System.out.println("===DAFTAR ANTREAN TAKE AWAY===");
                    System.out.println("Customer : " + i);
                    System.out.println("Nama ke : " + pq.poll());
                    System.out.println("==============================");
                    break;
                    
                case 3://keluar
                    System.out.println("Keluar");
                    keepLooping = false;
            }
        i++;    
        }while(keepLooping);
    }
    
}
