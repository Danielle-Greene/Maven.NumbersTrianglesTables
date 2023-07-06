package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }

    public static String getEvenNumbers(int start, int stop) {

        String result = "";

        for (int i = start; i < stop; i++) {

            if (!isOdd(i)) {
                result = result + i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i++) {
            if (isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }



        public static String getSquareNumbers ( int start, int stop, int step){
            return getExponentiations(start, stop, step, 2);
        }

        public static String getRange ( int stop){

            //Declare a string
            String poppi = "";

            int i;
            //set for loop conditions

            for (i = 0; i < stop; i++) {

                poppi += i;
            }

            return poppi;
        }

        public static String getRange ( int start, int stop){
            return getRange(start, stop, 1);
        }


        public static String getRange ( int start, int stop, int step){
            return getExponentiations(start, stop, step, 1);
        }


        public static String getExponentiations ( int start, int stop, int step, int exponent){

            StringBuilder sb = new StringBuilder();
            for (int i = start; i < stop; i += step) {
                sb.append((int) Math.pow(i,exponent));
            }
            return sb.toString();
        }
    }
