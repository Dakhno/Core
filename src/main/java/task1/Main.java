package task1;

public class Main {
    public static void main(String[] args) {
        double[][] Array = new double[5][5];
        fillArray(Array);
        minMaxAverage(Array);
        output(Array);
    }


    private static void output(double[][] a){
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void fillArray(double[][] a) {
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Math.random();
            }
        }
    }

    private static void minMaxAverage(double[][] a){
        double min = 0;
        double max = 0;
        double average = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] < min) {
                    min = a[i][j];
                }
                if(a[i][j] > max){
                    max = a[i][j];
                }
                average = average + a[i][j]/(a.length * a[0].length);
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
    }
}
