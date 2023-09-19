import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }

        // create two variable and then compare them with array element to see the first and second-largest element.
        int largest=-1,secondLargest=-1;
        for(int i:arr){
            if(largest>i){
                largest=i;
            }
            if(secondLargest<i && i>largest){
                secondLargest=i;
            }
        }
        System.out.println(secondLargest);

    }
}