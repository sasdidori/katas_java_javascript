package me.dora.katas.volumesofcuboids;

public class CuboidVolumes {
    public int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int vol1 = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int vol2 = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        int difference = vol1 - vol2;
        if (difference < 0) {
            int result = difference * (-1);
            return result;
        }
        return difference;
    }
}
