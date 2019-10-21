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
public class Kubus {
    private int sisi;
    private int massa;

    public Kubus(){ 
        
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int sisi){
        int volume;
        volume = sisi*sisi*sisi;
        return volume;
    }
    public int hitungMassaJenis(int massa, int volume){
        int massaJenis;
        massaJenis = massa/volume;
        return massaJenis;
    }
        
        
    }
    
   
