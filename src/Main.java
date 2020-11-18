public class Main {
    public static void main(String[] args) {
        int[] votes = new int[]{10, 9, 9, 9, 9, 9, 9, 9, 10, 9, 10, 10, 9, 9, 9};

        NPSService npsService = new NPSService();
        double nps = npsService.nps(votes);
        System.out.println(nps);

    }
}