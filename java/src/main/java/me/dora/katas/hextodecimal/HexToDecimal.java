package me.dora.katas.hextodecimal;

public class HexToDecimal {
    public int hexToDec(final String hexString) {
        int decimal = Integer.parseInt(hexString, 16);
        return decimal;
    }
}
