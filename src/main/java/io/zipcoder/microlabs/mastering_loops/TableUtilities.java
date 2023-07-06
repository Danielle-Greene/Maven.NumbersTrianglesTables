package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= tableSize; row++) {


            for (int column = 1; column <= tableSize; column++) {

                if (row * column < 10) {

                    sb.append("  " + row * column + " ");

                    sb.append("|");
                }

                if (row * column < 100 && row * column >= 10) {
                    sb.append(" " + row * column + " ");

                    sb.append("|");
                }

                if (row * column >= 100 ) {
                    sb.append(row * column + " ");

                    sb.append("|");

                }
            }
            sb.append("\n");
            }
                return sb.toString();
            }
        }