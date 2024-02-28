package me.dora.katas.countPetals;

public class CountPetals {
    public String howMuchILoveYou(int petals) {
        String[] sentences = {"I love you", "a little", "a lot", "passionately", "madly", "not at all" };
        int position = sentences.length - 1;
        String word = null;

        while(petals > 0){
            petals--;
            position++;
            if(position == 6) {
                position = 0;
            }
            word = sentences[position];
            System.out.println(word);
        }
        System.out.println(word);
        return word;
    }




}
