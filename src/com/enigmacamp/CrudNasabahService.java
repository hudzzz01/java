package com.enigmacamp;

public interface CrudNasabahService {
    public void create(Nasabah nasabah) throws Exception;
    public String read();
    public String update(Nasabah nasabah, Nasabah nasabahBaru);
    public String delete(Nasabah nasabah);
    public Nasabah getById(Integer idNasabah);

}
