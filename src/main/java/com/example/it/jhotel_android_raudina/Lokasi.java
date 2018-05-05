package com.example.it.jhotel_android_raudina;

public class Lokasi {
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    public Lokasi(double x_coord, double y_coord, String deskripsi)
    {//this digunakan karena nama variabel instance sama dengan
        //nama variabel parameter
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsi;
    }
    public void setX_coord(double x_coord)
    {
        this.x_coord=x_coord;
    }

    public double getX_coord()
    {
        return x_coord;
    }
    public void setY_coord(double y_coord)
    {
        this.y_coord=y_coord;
    }

    public double getY_coord()
    {
        return y_coord;
    }
    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi=deskripsi;
    }
    public String getDeskripsi()
    {
        return deskripsi;
    }

}
