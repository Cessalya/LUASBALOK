/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package luasbalok;

/**
 *
 * @author LENOVO
 */
public class LUASBALOK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p=5;
        int l=10;
        int t=5;
        System.out.print(" Nilai Panjang Balok : " +p );
        System.out.print(" Nilai Lebar Balok : " +l );
        System.out.print(" Nilai Tinggi Balok : " +t );
        System.out.print(" =============================== ");
        System.out.print(" Menghitung Luas Permukaan Balok ");
        System.out.print(" =============================== ");
        System.out.println(" Luas Permukaan Balok = " +((2*p*l)+(2*p*t)+(2*l*t)));
    }
    
}
