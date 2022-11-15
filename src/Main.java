public class Main {
    public static void main(String[] args) {
        System.out.println(getRentalCost(0) + "\n" + // 0
                getRentalCost(1) + "\n" + // 35
                getRentalCost(2) + "\n" + // 70
                getRentalCost(3) + "\n" + // 95
                getRentalCost(4) + "\n" + // 130
                getRentalCost(5) + "\n" + // 165
                getRentalCost(6) + "\n" + // 200
                getRentalCost(7) + "\n" + // 205
                getRentalCost(8) + "\n" // 240

        );
        System.out.println("-------------------------------------------------------");
        System.out.println(getMultipliedBoxDigits(new int[0]) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 4, 7, 8}) + "\n" +
                getMultipliedBoxDigits(new int[]{0, 0, 0, 0}) + "\n" +
                getMultipliedBoxDigits(new int[]{0, 1, 2, 3, 4, 5}) + "\n" +
                getMultipliedBoxDigits(new int[]{1}) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 2, 3}) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 2, 3, 4, 5}) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 2, 3, 4, 5, 6}) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 2, 3, 4, 5, 6}) + "\n" +
                getMultipliedBoxDigits(new int[]{1, 2, 3, 4}) + "\n" +
                getMultipliedBoxDigits(new int[]{-10, 5, -4}) + "\n" +
                getMultipliedBoxDigits(new int[]{-10, 5, 4})
        );
        System.out.println("-------------------------------------------------------");
        System.out.println(chartAnalyser(new String[]{"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"}) + "\n" +
                chartAnalyser(new String[]{"-", "-", "~", "-", "-", "-", "~", "~", "-", "-", "~", "-", "~"}) + "\n" +
                chartAnalyser(new String[]{"-", "~", "-", "~", "-", "~", "-", "~"}) + "\n" +
                chartAnalyser(new String[]{"~", "~", "-", "~", "~", "~", "~", "-", "-", "~", "~", "-", "-"}));


    }

    static void getPassanegerInfo(String name, String id) {
        System.out.println("Name:" + name + "\n Id:" + id);
    }

    static int getRentalCost(int days) {
        int cost = 35 * days;
        if (days >= 7) {
            cost -= 40;
        }
        if (days >= 3 && days < 7) {
            cost -= 10;
        }
        return cost;
    }

    static int getMultipliedBoxDigits(int[] digits) {
        if (digits.length == 0) {
            return 0;
        }
        int temp = 1;
        for (int d : digits) {
            temp *= d;
        }
        return temp;
    }

    static String chartAnalyser(String[] chart) {
        int count = 0;
        for (int i = 1; i < chart.length; i++) {
            if (chart[i].equals("~") && chart[i - 1].equals("-")) {
                count += 1;
            }
        }
        float temp = count * 100;
        int result = (int) Math.floor(temp/ chart.length);
        return result >= 30 ?"the chance is " + result +" It' closed" : "the chance is " + result + " It's open, be happy";
    }
}