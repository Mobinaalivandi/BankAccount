public class multidimensional {
    private String s;
    private double[] g;

   public multidimensional(String s, double[] g) {
        this.s = s;
        this.g = g;
    }
    public void array(multidimensional[] array) {
        double average = 0;
        for (int i = 0; i < g.length; ++i) {
            double sum = 0;
            for ( int j = 0 ; j < g.length ; ++ j) {
                sum = array[i].g[j] + sum;
            }
            average = sum / g.length;
            System.out.println(array[i].s + " " + "'s average score is : " + " " + average);
        }
    }
    public void score(multidimensional[] array) {
        double average = 0;
        for (int i = 0; i < g.length; ++i) {
            double sum = 0;
            for ( int j = 0 ; j < g.length ; ++ j) {
                sum = array[i].g[j] + sum;
            }
            average = sum / g.length;
            if (average > 15) {
                System.out.println(array[i].s + " " + "'s average score is higher than 15");
            }
        }
    }
    public void highest(multidimensional[] array) {
        double average = 0;
        double max = 0;
        String maxx = "";
        for (int i = 0; i < g.length; ++i) {
            double sum = 0;
            for ( int j = 0 ; j < g.length ; ++ j) {
            sum = array[i].g[j]+ sum;
            }
            average = sum / g.length;
            if (average > max) {
                max = average;
                maxx = array[i].s;
            }
        }
        System.out.println( maxx + " " + "has the highest average score with : " + " " + max);
    }
}





