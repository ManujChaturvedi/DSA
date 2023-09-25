

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {

    Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list

        int num1=0,num2=0,max1=0,max2=0;

        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        while(first!=null){
            s1.push(first.data);
            first=first.next;
            max1++;
        }

        while(second!=null){
            s2.push(second.data);
            second=second.next;
            max2++;
        }

        int carry=0;
        List<Integer> list=new ArrayList<>();

        if(max1>max2){
            while(!s2.isEmpty()){
                int dig1=s1.pop();
                int dig2=s2.pop();
                int sum=dig1+dig2+carry;
                // System.out.println(sum%10);
                list.add(0,sum%10);
                carry=sum/10;
            }

            while(!s1.isEmpty()){
                int dig1=s1.pop();
                // System.out.println(dig1);
                int sum=dig1+carry;
                list.add(0,sum%10);
                carry=sum/10;
            }

            if(carry!=0){
                list.add(0,carry);
            }

        }else{

            while(!s1.isEmpty()){
                int dig1=s1.pop();
                int dig2=s2.pop();
                int sum=dig1+dig2+carry;
                // System.out.println(sum%10);
                list.add(0,sum%10);
                carry=sum/10;
            }

            while(!s2.isEmpty()){
                int dig1=s2.pop();
                // System.out.println(dig1);
                int sum=dig1+carry;
                list.add(0,sum%10);
                carry=sum/10;
            }

            if(carry!=0){
                list.add(0,carry);
            }

        }

        Node head=new Node(list.get(0));
        Node tempHead=head;

        for(int i=1;i<list.size();i++){

            Node temp=new Node(list.get(i));
            tempHead.next = temp;
            tempHead = temp;
        }

        return head;
    }
}
