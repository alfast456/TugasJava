/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class searchLinkedList {
        public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> cars = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan 10 nama");
        for(int i = 0; i < 5; i++){
            String nama = input.nextLine();
            cars.addLast(nama);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Elemen ke : " + i);
            System.out.println("Nilai : " + cars.get(i));
            System.out.println("---------------------");
        }
        
        System.out.println("Masukkan nama yang dicari ");
        String cari = input.nextLine();
        
        for (int i = 0; i < 5; i++) {
            if (cari.equals(cars.get(i))) {
                System.out.println("ada dilokasi ke : " + i);
                
            }
            
        }
    }
}
