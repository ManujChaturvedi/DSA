
class Solution
{


    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev=null;
        Node cur=node;
        Node next=null;
        Node first=node;
        int tempK=k;

        while(cur!=null){

            if(tempK==0){
                first.next = reverse(cur,k);
                return prev;
            }

            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;

            tempK--;
        }

        return prev;

    }
}