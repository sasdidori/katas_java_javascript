package me.dora.katas.catsandshelves;

public class CatsAndShelves {

    public int solution(int start, int finish) {
        int shelves = finish - start;
        int stepsWith3 = shelves / 3;
        int stepsWith1 = shelves - stepsWith3;
        int result = stepsWith1 + stepsWith3;
        return result;
    }
}
