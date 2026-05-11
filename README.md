# Sistem Penggajian Karyawan

Aplikasi berbasis **Java** untuk mengelola data karyawan dan menghitung gaji secara otomatis berdasarkan jenis kontrak kerja. Proyek ini mensimulasikan bagaimana perusahaan mengelola karyawan tetap dan paruh waktu dalam satu sistem terorganisir menggunakan konsep **OOP**, **Multithreading**, dan **GUI**.

---

## Tujuan Utama

Menerapkan **4 pilar Pemrograman Berorientasi Objek (OOP)**:
- **Enkapsulasi** – Menyembunyikan data dan hanya mengakses melalui method tertentu.
- **Abstraksi** – Menggunakan kelas abstrak untuk karyawan.
- **Inheritance** – Kelas `KaryawanTetap` dan `KaryawanParuhWaktu` mewarisi kelas abstrak `Karyawan`.
- **Polimorfisme** – Menghitung gaji dengan cara berbeda untuk tiap jenis karyawan.

Selain itu, proyek ini juga mengimplementasikan **Multithreading** untuk memproses penggajian secara paralel.

---

## Fitur Utama

- ✅ Manajemen data karyawan (**CRUD**)
- ✅ Perhitungan gaji otomatis (tetap & paruh waktu)
- ✅ **GUI** berbasis **Java Swing**
- ✅ Penyimpanan data menggunakan **MySQL** via **JDBC**
- ✅ Arsitektur **MVC** (Model-View-Controller)
- ✅ Proses penggajian menggunakan **multithreading**

---

## Teknologi yang Digunakan

| Komponen       | Teknologi                     |
|----------------|-------------------------------|
| Bahasa         | Java (JDK 8+)                 |
| GUI            | Java Swing (JFrame Form)      |
| Database       | MySQL                         |
| Konektor DB    | JDBC                          |
| Arsitektur     | MVC                           |
| Concurrency    | Multithreading (Thread/Runnable) |

---

## Struktur Proyek (MVC)
```bash
SistemPenggajianKaryawan
│
├── Source Packages
│   ├── app
│   │   └── Main.java
│   │
│   ├── model
│   │   ├── Karyawan.java
│   │   ├── KaryawanTetap.java
│   │   ├── KaryawanParuhWaktu.java
│   │   └── DatabaseConnection.java
│   │
│   ├── view
│   │   └── MainFrame.java
│   │
│   └── controller
│       ├── KaryawanController.java
│       └── PenggajianController.java
│
└── Libraries
    └── mysql-connector-java-8.x.xx.jar
```

---

## Minimum Requirements

| Requirement            |
|------------------------|
| 4 pilar OOP            | 
| Multithreading         | 
| GUI (Java Swing)       | 
| JDBC + MySQL           | 
| Minimal 1 CRUD         | 
| MVC                    | 
| Boleh pakai JFrame Form|

---
