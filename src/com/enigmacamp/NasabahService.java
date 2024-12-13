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

    void deleteNasabahFromArr(Nasabah nasabah) throws Exception {
        //get index nasabah
        Boolean flag = false;
        Integer index = 0;
        for (int i = 0; i < items.length; i++) {
            Nasabah item = items[i];

            //kalau berhasil ambil index array
            if(item != null) {
               if(nasabah.getId() == item.getId()) {
                   index = i;
                   flag = true;
                   this.nasabahCount -= 1;
               };
            }

        }

        //kalau index array gagal diambil
        if (!flag) throw new Exception("gagal mengambil index Arr");

        //sekarang nilai index sudah berhasil di ambil ubah data tersebut menjadi null
        items[index] = null;



    }

    void rapihkanArrItems(){
        //buat array kosong baru untuk di isi dengan data baru sepanjang array lama
        Nasabah[] newItem = new Nasabah[this.items.length];

        //looping iterasi untuk memindahkan arrlama jika tidak null ke arr bary
        Integer flagIndexArrBaru = 0;
        for (int i = 0; i < this.items.length; i++) {
            Nasabah item = this.items[i];

            //pindahkan ke array baru
            if(item != null) {
                newItem[flagIndexArrBaru] = item; //ini belum di clone !!!! baru mindahin aj
                flagIndexArrBaru++;
            };
        }



        //jika sudah selesai ubah this.item dengan array baru yang sudah rapihi
        this.items = newItem;


    }


    Nasabah ambilNasabahById(Integer id) throws Exception {
        for (Nasabah item : items){
            if(item != null) {
                if(id.equals(item.getId())) return item;
            }
        }
        throw new Exception("Id tidak ditemukan");
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
        System.out.println("berikut adalah seluruh data nasabah yang tersimpan :");
        System.out.println(Arrays.toString(items));
        return Arrays.toString(items);
    }

    @Override
    public String delete(Nasabah nasabah) {
        try{
            //hapus data nasabah dan bersihkan Array dari null null
            deleteNasabahFromArr(nasabah);

            //rapihkan array
            rapihkanArrItems();

            System.out.println("data berhasil dihapus : ");
            System.out.println(Arrays.toString(items));

            return Arrays.toString(items);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "";
    }

    @Override
    public Nasabah getById(Integer idNasabah) {
        try{
            Nasabah nasabah = ambilNasabahById(idNasabah);
            System.out.println("berhasil mendapatkan nasabah");
            System.out.println(nasabah);
            return nasabah;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return new Nasabah();
        }
    }

    public Nasabah getById(String idNasabah) {
        try{
            if(idNasabah.equals("")) throw new Exception("id tidak boleh kosong");
            Nasabah nasabah = ambilNasabahById(Integer.parseInt(idNasabah));
            System.out.println("berhasil mendapatkan nasabah");
            System.out.println(nasabah);
            return nasabah;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return new Nasabah();
        }
    }

    @Override
    public String update(Nasabah nasabah, Nasabah dataBaru ) {
        try {
            //cek id tersedia atau tidak
            if(nasabah.getId() != dataBaru.getId()){
                System.out.println(nasabah.getId());
                System.out.println(dataBaru.getId());
                cekIdNasabahTersedia(dataBaru);
            }


            // cek nik
            if(!nasabah.getNik().equals(dataBaru.getNik())){
                cekNikNasabahTersedia(dataBaru);
            }

            //cek nomor hp unique
            if(!nasabah.getPhoneNumber().equals(dataBaru.getPhoneNumber())){
                cekNomorHpNasabahTersedia(dataBaru);
            }

            //hapus data nasabah dan bersihkan Array dari null null
            deleteNasabahFromArr(nasabah);

            //rapihkan array
            rapihkanArrItems();

            //cek items sekarang
//            System.out.println(Arrays.toString(this.items)); //seharusnya sudah terhapus

            items[nasabahCount++] = dataBaru;
            System.out.println("berhasil menambahkan data baru");
            System.out.println(Arrays.toString(items));


            return Arrays.toString(items);





        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "";
    }
}