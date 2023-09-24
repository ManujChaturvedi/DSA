public class Solution {

    int maxIndexDiff(int[] arr, int n) {
        // code here
        int[] max=new int[n];
        int[] min=new int[n];

        max[n-1]=arr[n-1];
        min[0]=arr[0];


        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(arr[i],max[i+1]);
        }

        for(int i=1;i<n;i++){
            min[i]=Math.min(arr[i],min[i-1]);
        }


        int i=0,j=0;
        int maxDiff=-1;

        while(i<n && j<n){
            // System.out.println(max[i]+" "+min[j]);
            if(max[i]>=min[j]){
                maxDiff=Math.max((i-j),maxDiff);
                i++;
            }else{
                j++;
            }
        }


        return maxDiff;


    }

}
