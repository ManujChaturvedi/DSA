import java.util.HashSet;
import java.util.Set;

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum=0;
        Set<Integer> set=new HashSet<>();

        for(int i: arr){
            sum+=i;
            if(set.contains(sum) || sum==0) return true;
            set.add(sum);
        }
        return false;
    }
}