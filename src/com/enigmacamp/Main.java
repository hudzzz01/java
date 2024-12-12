package com.enigmacamp;

public class Main {
    public static void main(String[] args) throws Exception {
        Nasabah newNasabah = new Nasabah(1,"Juan","12345","085813934746","200-01-01");
        Nasabah newNasabah2 = new Nasabah(2,"koko","12345","085813934746","200-01-01");
        Nasabah newNasabah3 = new Nasabah(3,"omar","123456","085813934746","200-01-01");
        Nasabah newNasabah4 = new Nasabah(4,"lili","1234567","0858139347467","200-01-01");
        Nasabah newNasabah5 = new Nasabah(5,"Janda","12345670","08581139347467","200-01-01");
        NasabahService service = new NasabahService();

//        ----------- Create Nasabah
        service.create(newNasabah);
        service.create(newNasabah2);
        service.create(newNasabah3);
        service.create(newNasabah4);
        service.create(newNasabah5);
        for (int i = 0; i < 16; i++) {
            service.create(newNasabah);
        }

//        ------------- Read Nasabah
        service.read();

//        ------------ Get By Id
//        service.getById("");
//        service.getById("1"); //overloading
//        service.getById(0);
//        service.getById(1);


//        ------------ update
        System.out.println("update");
        Nasabah newNasabah6 = new Nasabah(7,"hudzaifah","1234567111","0858139347444","200-01-02");
        Nasabah newNasabah7 = new Nasabah(8,"agus","12345671111","08581319347444","200-01-02");

        service.update(newNasabah,newNasabah6);
        service.update(newNasabah4,newNasabah7);










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