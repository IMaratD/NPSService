public class Main {
    public static void main(String[] args) {
        int[] points = new int[]{10, 2, 8, 9, 9, 6, 7, 9, 10, 8, 1, 10, 6, 9, 9};
        int neutralsLow = 7;
        int neutralsUp = 8;

        int length = points.length;

        int promoters =0;
            for (int point : points) {
                if (point > neutralsUp) {
                    promoters = promoters + 1;
            }
        }

        int detractores = 0;
        for (int point : points) {
            if (point < neutralsLow) {
                detractores = detractores +1;
            }
        }

        Double nps = (promoters - detractores) * 100.00 / length;
        System.out.println(nps);
    }
}