/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan41.massajenis;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG 
 */
public class PBOUL10115229Latihan41MassaJenis {
    private static int volume;
    private static int massajenis;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Kubus kubus1 = new Kubus();
       
       kubus1.setSisi(5);
       kubus1.setMassa(250);
       
       System.out.println("====== Massa Jenis Kubus ======");
       System.out.println("Sisi : "+kubus1.getSisi());
       System.out.println("Sisi : "+kubus1.getMassa()+"\n");
       

       System.out.println("====== Hasil Perhitungan ======");
       volume = kubus1.hitungVolume(kubus1.getSisi());
       System.out.println("Volume : "+volume);
       
       massajenis = kubus1.hitungMassaJenis(kubus1.getMassa(), volume);
       System.out.println("Massa Jenis : "+massajenis+"\n\n");    
    }
    
}
