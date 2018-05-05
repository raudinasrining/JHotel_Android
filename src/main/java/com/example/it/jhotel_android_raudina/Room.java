package com.example.it.jhotel_android_raudina;

public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    public Room (String roomNumber, String statusKamar, double dailyTariff, String tipeKamar)
    {
        this.roomNumber=roomNumber;
        this.statusKamar=statusKamar;
        this.dailyTariff=dailyTariff;
        this.tipeKamar=tipeKamar;
    }

    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber=roomNumber;
    }

    public String getRoomNumber()
    {
        return roomNumber;
    }

    public void setStatusKamar(String statusKamar)
    {
        this.statusKamar=statusKamar;
    }

    public String getStatusKamar()
    {
        return statusKamar;
    }

    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff=dailyTariff;
    }

    public double getDailyTariff()
    {
        return dailyTariff;
    }
    public void TipeKamar(String tipeKamar)
    {
        this.tipeKamar=tipeKamar;
    }

    public String getTipeKamar()
    {
        return tipeKamar;
    }
}
