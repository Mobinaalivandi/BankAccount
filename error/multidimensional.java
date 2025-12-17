public class multidimensional {
    private String s;
    private double[] g;

    multidimensional(String s, double[] g) {
        this.s = s;
        this.g = g;
    }
    public void array(multidimensional[] array) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < g.length; ++i) {
            sum = g[i] + sum;
        }
        average = sum / g.length;
            System.out.println( " " + "'s average score is : " + " " + average);
        }
    public void score(multidimensional[] array) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < g.length; ++i) {
            sum = g[i] + sum;
        }
        average = sum / g.length;
            if (average > 15) {
                System.out.println( " " + "'s average score is higher than 15");
            }
        }
    public void highest(multidimensional[] array) {
        double average = 0;
        double max = 0;
        String maxx = "";
        double sum = 0;
        for (int i = 0; i < g.length; ++i) {
                sum = array[i].g[i]+ sum;
            }
            average = sum / g.length;
        for (int i = 0; i < g.length; ++i) {
            if (average > max) {
                max = average;
                maxx = array[i].s;
            }
        }
        System.out.println( maxx + " " + "has the highest average score with : " + " " + max);
    }
}





