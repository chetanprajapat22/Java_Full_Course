package in.co.Excercise;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Harmonic series: ");
        double sum = 0.0;

        for (int i=1;i<=n;i++){

            double term = 1.0/i;
            sum += term;
            System.out.print(i);
//            System.out.println(i);
        }
        System.out.println("\n sum of the harmonic series: " + sum);
    }
}
