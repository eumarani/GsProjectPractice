import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args){
        int n=10;
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(10)
                .map(f->f[0])//for the first element
                .forEach(System.out::println);
    /*public static int[] series(int n){
        int[] fibonacci = new int[n];
        int first=0,second=1;
        for(int i=0;i<10;i++){
            fibonacci[i]=first;
            int next=first+second;
            first=second;
            second=next;
        }


        return fibonacci;
    }
    public static void main(String[] args){
        int n=10;
        int[] arr=series(n);
        for(int i:arr){
            System.out.println(i+" ");
        }*/


    }
}
