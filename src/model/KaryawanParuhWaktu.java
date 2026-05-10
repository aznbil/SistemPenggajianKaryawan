/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author purcell
 */
public class KaryawanParuhWaktu extends Karyawan { // inheritance
    private int jamKerja;
    private final int UPAH_PER_JAM = 50000;
    
    public KaryawanParuhWaktu(String nip, String nama, int jamKerja) {
        super(nip, nama, "Paruh Waktu");
        this.jamKerja = jamKerja;
    }
    
    @Override
    public double hitungGaji() { // Polymorphism
        return jamKerja * UPAH_PER_JAM;
    }
    
    // Getter Setter
    public int getJamKerja() { return jamKerja; }
    public void setJamKerja(int jamKerja) { this.jamKerja = jamKerja; }
    
    public int getUpahPerJam() { return UPAH_PER_JAM; }
}
