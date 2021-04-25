package com.company;
                 //תעשיתי
public class indstrial extends Company implements investments {
    String type;//סוג
    int namOfPlants;//שם המפעל

    public indstrial(String type, int namOfPlants) {
      this.type = type;
      this.namOfPlants = namOfPlants;
       }

                     @Override
    public int add(int funds) {
        return 1200000;
    }

    @Override
    public void AddWorkers() {
        super.AddWorkers();
    }
}
