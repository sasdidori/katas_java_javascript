package me.dora.katas.catsanddogs;

public class CatsAndDogs {

    public int[] humanYearsCatYearsDogYears(int humanYears) {
        int catAge = 0;
        int dogAge = 0;
        switch (humanYears) {
            case 1:
                catAge = 15;
                dogAge = 15;
                break;
            case 2:
                catAge = 24;
                dogAge = 24;
                break;
            default:
                catAge = 24 + (humanYears - 2) * 4;
                dogAge = 24 + (humanYears - 2) * 5;
                break;
        }
        return new int[]{humanYears, catAge, dogAge};
    }

}
