package com.enigmacamp;

public interface CrudNasabahService {
    public String create(Nasabah nasabah) throws Exception;
    public String read();
    public String update(Nasabah nasabah);
    public String delete(Nasabah nasabah);
    public String getById(Nasabah nasabah);

}
