package day6;

public class TwiceNumberArray {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int rem, div;
        int counter=0;
        for (int i = 0; i<=100; i++){
            rem = (i%10);
            div = (i/10);
            if (rem==div && div!=0){
                arr[(counter++)]=i;
                System.out.println(+i+ " is repeated");
            }
        }
    }
}