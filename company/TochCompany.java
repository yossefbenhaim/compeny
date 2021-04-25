package com.company;

import java.util.Date;
import java.util.HashMap;

public class TochCompany extends Company implements IOP ,investments{//חברת הייטק
    Date nextProduct;//המוצר הבא
    String manufacturCountry;//הארץ יצור
    HashMap<String,String> products;//המוצר


    public TochCompany( int marketCap,int numOfWorkers, Date nextProduct,
                        String manufacturCountry, HashMap<String, String> products) {
        this.nextProduct = nextProduct;//המוצר הבא
        this.manufacturCountry =manufacturCountry;//הארץ יצור
        this.numOfWorkers=numOfWorkers;//כמות העובדים
        this.products = products;//מוצר :(צריך לירשום את השם של האשמאף בישביל להכניס לשם נתון חדש חדש )
        this.marketCap=marketCap;//שווי השוק
    }
    public void addProduct(String K,String V){
     products.put(K,V);//שם המערך ואז מוסיפף לן דרך המתודה הזאת ערך חדש
    }

    @Override
    public void setMarketcap() {
        System.out.println(this.manufacturCountry);
    }

    @Override
    public int add(int funds) {
        this.marketCap+= funds;
        return this.marketCap;
    }

    @Override
    public void AddWorkers() {
        super.AddWorkers();
    }
}
