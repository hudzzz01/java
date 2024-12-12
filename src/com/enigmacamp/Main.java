package com.enigmacamp;

public class Main {
    public static void main(String[] args) throws Exception {
        Nasabah newNasabah = new Nasabah(1,"Juan","12345","085813934746","200-01-01");
        NasabahService service = new NasabahService();

//        ----------- Create Nasabah
        service.create(newNasabah);


//        ------------- Read Nasabah
        System.out.println(service.read());



    }
}


// Lanjutkanlah handsin dengan ketentuan berikut :
// 1. Lengkapi Service CRUD (create, read (list dan by id) , update dan delete)
// 2. Implementasikan sebuah exception untuk validasi berikut :
//      a. validasi jika data sudah penuh tambahkan validasi
//      b. validasi jika data tidak ada ketika melakukan (update, delete, delete dan get by id); Data ga boleh ada kosong di tengah
//      c. validasi jika id, nik dan phone number sudah ada harus unique
// 3. Buatlah branch baru dengan nama 02-use-interface dan gunakanlah interface/contract untuk servicenya
// 4. buatlah commit perfitur
//
// contoh
// feat : create nasabah
// feat : update nasabah
// fix : unique attribute validation when create data
//