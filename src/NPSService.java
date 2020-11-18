public class NPSService {
    private int neutralsLow = 7;
    private int neutralsUp = 8;

    public double nps(int[] votes) {
        int detractores = 0;
        int promoters = 0;
        for (int vote : votes) {
            if (vote < neutralsLow) {
                detractores = detractores + 1;
            }

            if (vote > neutralsUp) {
                promoters = promoters + 1;
            }
        }
        return (promoters - detractores) * 100.00 / votes.length;
    }
}
