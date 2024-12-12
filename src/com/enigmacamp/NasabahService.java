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


    @Override
    public String create(Nasabah nasabah) throws Exception {
        Integer itemCount = 0;

        for (Nasabah item : items){
            if(item == null) {
                itemCount++;
            }
        }

        if (itemCount != items.length) throw new Exception("Array sudah penuh");
        items[nasabahCount++] = nasabah;
        return "Berhasil Menambahkan Nasabah baru";
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
