package com.enigmacamp;

public class Main {
    public static void main(String[] args) throws Exception {
//        Nasabah newNasabah = new Nasabah(1,"Juan","12345","085813934746","200-01-01");
//        Nasabah newNasabah2 = new Nasabah(2,"koko","12345","085813934746","200-01-01");
//        Nasabah newNasabah3 = new Nasabah(3,"omar","123456","085813934746","200-01-01");
//        Nasabah newNasabah4 = new Nasabah(4,"lili","1234567","0858139347467","200-01-01");
//        Nasabah newNasabah5 = new Nasabah(5,"Janda","12345670","08581139347467","200-01-01");
//        NasabahService service = new NasabahService();
//
////        ----------- Create Nasabah
//        service.create(newNasabah);
//        service.create(newNasabah2);
//        service.create(newNasabah3);
//        service.create(newNasabah4);
//        service.create(newNasabah5);
//        for (int i = 0; i < 16; i++) {
//            service.create(newNasabah);
//        }
//
////        ------------- Read Nasabah
//        service.read();
//
////        ------------ Get By Id
////        service.getById("");
////        service.getById("1"); //overloading
////        service.getById(0);
////        service.getById(1);
//
//
////        ------------ update
//        System.out.println("update");
//        Nasabah newNasabah6 = new Nasabah(7,"hudzaifah","1234567111","0858139347444","200-01-02");
//        Nasabah newNasabah7 = new Nasabah(8,"agus","12345671111","08581319347444","200-01-02");
//
//        service.update(newNasabah,newNasabah6);
//        service.update(newNasabah4,newNasabah7);
//
////        ------------- delete
//        service.delete(newNasabah6);

        NasabahService service = new NasabahService();

//        --------- create

        service.create(new Nasabah(1,"Juan","12345","085813934746","200-01-01"));
        service.create(new Nasabah(1,"Juan","12345","085813934746","200-01-01"));
        service.create(new Nasabah(2,"Juan","12345","085813934746","200-01-01"));

        Nasabah nasabah = new Nasabah(3,"Janda","128345","08581395534746","200-01-01");
        service.create(nasabah);

//        -------- read
        service.read();

//        ---------update
        Nasabah nasabahBaru = new Nasabah(2,"Juan","12346","085813934746","200-01-01"); //nik sudah digunakan
        Nasabah nasabahBaru2 = new Nasabah(3,"Joko","1245","08581394746","200-01-01"); //nik sudah digunakan
        service.update(nasabah,nasabahBaru2);


//        ------delete
        service.delete(nasabahBaru2);








    }
}
