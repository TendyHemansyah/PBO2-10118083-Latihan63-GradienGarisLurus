/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan63.gradiengarislurus;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Gradien Garis Lurus
 */
public class GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k1, k2;
        
        k1 = new Koordinat(2, 10, 5, 7);
        k2 = new Koordinat(5, 1, 3, 12);
        
        tampilHasil(k1.getX1(), k1.getY1(), k1.getX2(), k1.getY2(), k1.hitungGradien());
        tampilHasil(k2.getX1(), k2.getY1(), k2.getX2(), k2.getY2(), k2.hitungGradien());
    }
    
    public static void tampilHasil(int x1,int y1,int x2,int y2, int gradien) {
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d, %d)%n"
                + "memiliki gradien sebesar %d%n", x1, y1, x2, y2, gradien);
    }
    
}
