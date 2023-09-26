package com.posttest1;

import com.posttest1.Smartphone;
import java.util.ArrayList;

public class Posttest1 {


    public static void main(String args[]) {
        // Membuat ArrayList untuk menyimpan objek-objek smartphone
        ArrayList<Smartphone> smartphones = new ArrayList<>();

        // Menambahkan objek-objek smartphone ke dalam ArrayList
        smartphones.add(new Smartphone("Samsung", "Galaxy S21", 128, 3000000));
        smartphones.add(new Smartphone("Apple", "iPhone 12", 256, 8000000));
        smartphones.add(new Smartphone("Google", "Pixel 6", 128, 2500000));
        smartphones.add(new Smartphone("OnePlus", "9 Pro", 256, 400000));
        smartphones.add(new Smartphone("Xiaomi", "Mi 11", 128, 100000));        


        
        // Menampilkan informasi tentang setiap smartphone dalam ArrayList
        for (Smartphone phone : smartphones) {
            phone.displayInfo();
}
}
}