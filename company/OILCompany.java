package com.company;

public class OILCompany extends Company implements IOP {//חברת נפט
    String country;//באיזה מקום זה נימצא (מדינה)
    int storage;

    public OILCompany(String country, int storage) {
        this.country = country;
        this.storage = storage;
    }

    public void bankrupcy(){//פשיטת רגל
        System.out.println("2022");

    }

    @Override
    public void setMarketcap() {
        System.out.println(300000000);
    }

    @Override
    public void AddWorkers() {
        super.AddWorkers();
    }

}
