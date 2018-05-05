package com.example.it.jhotel_android_raudina;

public class Hotel {
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(int id, String nama, Lokasi lokasi, int bintang)
    {//this digunakan karena nama variabel instance sama dengan
        //nama variabel parameter
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id= id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return id;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }

    public String getNama()
    {
        return nama;
    }
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi=lokasi;
    }

    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public void setBintang(int bintang)
    {
        this.bintang=bintang;
    }

    public int getBintang()
    {
        return bintang;
    }
}
