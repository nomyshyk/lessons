public class AverageDouble {
    public static void main(String[] args) {
        double arr[] = new double[10];
        for(int i=0; i < arr.length; i ++){
            arr[i] = Math.random()*100;
            System.out.println(arr[i]);
        }
        middle(arr);

    }
    static void middle(double[] a){
        double summa = 0;
        for(int i = 0; i < a.length; i++){
         summa+=a[i];
        }
        System.out.printf("Среднее: %.3f", summa/a.length);
    }
}
