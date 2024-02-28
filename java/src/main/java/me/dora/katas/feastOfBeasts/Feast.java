package me.dora.katas.feastOfBeasts;


// security at the door: I have to check if the animal can enter the party
//if the dishes name starts and ends with the same letters as the animal's name -> true, let the animal in
// if not -> false, can't go to the party
// 1. ask for animals name
// 2. check for first letter -> remember it
//3. ask for the foods name
//4. check for first letter -> remember it
//5. compare the two first letters
//6. check for last letter in the animals name -> remember it
//7. check for last letter in the foods name -> remember it
//8. compare the last letters
//9. if both first and last letters were the same -> animal can go to the party
//10. if one is not the same -> animal can't go to the party
public class Feast {
    public boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
