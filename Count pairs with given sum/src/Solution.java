import java.util.HashMap;
import java.util.Map;

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();

        int count=0;

        for(int i:arr){

            if(map.containsKey(k-i)){
                count+=map.get(k-i);
            }

            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }

        }
        return count;
    }
}