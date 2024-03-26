package me.dora.katas.decimaltimeconversion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

public class DecimalTimeConversion {

    public static double toIndustrial(String time){
        String[] splitted = time.split(":");
        System.out.println(Arrays.toString(splitted));
        double hours = Double.parseDouble(splitted[0]);
        double minutes = Double.parseDouble(splitted[1]);
        System.out.println("hours: " + hours + "minutes: " + minutes);
        double result = (hours * 60 + minutes) / 60;
        System.out.println("result is: " + result);
        DecimalFormat df = new DecimalFormat("#0.00", DecimalFormatSymbols.getInstance(Locale.US));
        String formattedResult = df.format(result);
        System.out.println("formatted result is: " + formattedResult);
        double finalResult = Double.parseDouble(formattedResult);
        System.out.println("this is the final result " + finalResult);
        return finalResult;
    }

    public double toIndustrial(int time){
        double timeInDouble = time;
        double decimalTime =  timeInDouble / 60;
        BigDecimal convertTo2Decimals = new BigDecimal(decimalTime).setScale(2, RoundingMode.HALF_UP);
        return convertTo2Decimals.doubleValue();
    }

    public static String toNormal(double time){
        double minutes = Math.ceil(time * 60);
        System.out.println("minutes are now: " +  minutes);
        int counter = 0;
        while(minutes >= 60){
            minutes = minutes - 60;
            System.out.println("minutes is: " + minutes);
            counter++;
        }
        DecimalFormat df = new DecimalFormat("##00", DecimalFormatSymbols.getInstance(Locale.US));
        String formattedResult = df.format(minutes);
        String counterString = Integer.toString(counter);
        System.out.println("formatted minutes: " + formattedResult);
        return String.join(":", counterString, formattedResult);
    }

}
