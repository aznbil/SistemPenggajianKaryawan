/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author purcell
 */
public abstract class Karyawan {
    // Encapsulation: protected biar child class bisa akses
    protected int id;
    protected String nip;
    protected String nama;
    protected String jenisKontrak;
    
    // Constructor
    public Karyawan(String nip, String nama, String jenisKontrak) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKontrak = jenisKontrak;
    }
    
    // Abstract method (Abstraction)
    public abstract double hitungGaji();
    
    // Getter dan Setter (Encapsulation)
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    
    public String getNip() { 
        return nip; 
    }
    
    public void setNip(String nip) { 
        this.nip = nip; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public String getJenisKontrak() { 
        return jenisKontrak; 
    }
    
    public void setJenisKontrak(String jenisKontrak) { 
        this.jenisKontrak = jenisKontrak; 
    }
}
