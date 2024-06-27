package com.oop.tableviewyamahaservicecenter;

public class Client {
    private String name;
    private String chasisnumber;
    private String phonenumber;
    private int totalkmrun;


    public Client(String name, String chasisnumber, String phonenumber, int totalkmrun) {
        this.name = name;
        this.chasisnumber = chasisnumber;
        this.phonenumber = phonenumber;
        this.totalkmrun = totalkmrun;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChasisnumber() {
        return chasisnumber;
    }

    public void setChasisnumber(String chasisnumber) {
        this.chasisnumber = chasisnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getTotalkmrun() {
        return totalkmrun;
    }

    public void setTotalkmrun(int totalkmrun) {
        this.totalkmrun = totalkmrun;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", chasisnumber='" + chasisnumber + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", totalkmrun='" + totalkmrun + '\'' +
                '}';
    }
}
