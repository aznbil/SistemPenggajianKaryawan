/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author purcell
 */
public class KaryawanTetap extends Karyawan{ // inheritance
    private double gajiPokok;
    private double bonus;
    
    public KaryawanTetap(String nip, String nama, double gajiPokok, double bonus) {
        super(nip, nama, "Tetap");
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
    }
    
    @Override
    public double hitungGaji() { // Polymorphism
        return gajiPokok + bonus;
    }
    
    // Getter Setter
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    
    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
    
    public double getBonus() { 
        return bonus; 
    }
    
    public void setBonus(double bonus) { 
        this.bonus = bonus; 
    }
}
