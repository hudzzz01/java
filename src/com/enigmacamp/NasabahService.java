package com.enigmacamp;

import java.util.Arrays;

public class NasabahService implements CrudNasabahService {
    //memanipulasi data nasabah
    //Create update delete nasabah

    private Nasabah[] items = new Nasabah[15];
    private int nasabahCount = 0;

    public NasabahService(){}

  

    public Nasabah[] getItems() {
        return items;
    }

    void cekSlotArrItems() throws Exception {
        Integer itemCount = 0;

        for (Nasabah item : items){
            if(item != null) {
                itemCount++;
            }
        }

        if (itemCount == items.length) throw new Exception("Array sudah penuh");
    }

    void cekIdNasabahTersedia(Nasabah nasabah) throws Exception {
        Integer idNasabah = nasabah.getId();

        for (Nasabah item : items){
            if(item != null) {
                if(idNasabah.equals(item.getId())) throw new Exception("Id sudah digunakan");
            }
        }

    }

    void cekNikNasabahTersedia(Nasabah nasabah) throws Exception {
        String nikNasabah = nasabah.getNik();

        for (Nasabah item : items){
            if(item != null) {
                if(nikNasabah.equals(item.getNik())) throw new Exception("Nik sudah digunakan");
            }
        }

    }

    void cekNomorHpNasabahTersedia(Nasabah nasabah) throws Exception {
        String nasabahPhoneNumber = nasabah.getPhoneNumber();

        for (Nasabah item : items){
            if(item != null) {
                if(nasabahPhoneNumber.equals(item.getPhoneNumber())) throw new Exception("Nomor HP sudah digunakan");
            }
        }
    }

    @Override
    public void create(Nasabah nasabah){
        try{
            //cek kapasitas nasabah
            cekSlotArrItems();

            //cek id tersedia atau tidak
            cekIdNasabahTersedia(nasabah);

            // cek nik
            cekNikNasabahTersedia(nasabah);

            //cek nomor hp unique
            cekNomorHpNasabahTersedia(nasabah);


            items[nasabahCount++] = nasabah;


            System.out.println("Berhasil Menambahkan Nasabah baru");
        }catch (Exception e){
            System.out.println("Gagal membuat nasabah baru ! error ->" + e.getMessage());
        }

    }

    @Override
    public String read()  {
        return Arrays.toString(items);
    }

    @Override
    public String update(Nasabah nasabah) {
        return "";
    }

    @Override
    public String delete(Nasabah nasabah) {
        return "";
    }

    public String getById(Nasabah nasabah) {
        return "";
    }

}
