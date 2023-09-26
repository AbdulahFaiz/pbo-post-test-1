package com.posttest1;


public class Smartphone {
    // Property
    public String brand;
    public String model;
    public int kapasitasMemory;
    public int harga;

    // Constructor
    public Smartphone(String brand, String model, int kapasitasMemory, int harga) {
        this.brand = brand;
        this.model = model;
        this.kapasitasMemory = kapasitasMemory;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi tentang smartphone
    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Kapasitas Penyimpanan: " + kapasitasMemory + " GB");
        System.out.println("Harga: Rp." + harga);
        System.out.println();
}
}