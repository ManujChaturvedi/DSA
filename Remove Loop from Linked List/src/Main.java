public class Main {
    class Node
    {
        int data;
        Node next;
    }
    public static void main(String[] args) {


/*
        //First Detect if a loop is there or not for that make use of tortoise hare algorithm i.e., the 2 Pointer method
        Node slow=head,fast=head;

        // variable to mark if there is a cycle or not ?
        boolean cycle=false;

        //Making use of 2-Pointer algorithm:
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }

        }

        //if cycle is there place the slow pointer at the head and move till both don't collide the will always collide at the start of the loop
        if(cycle){

            slow=head;

            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }

            fast=fast.next;

            // Make the fast pointer go around the loop once more to find slow, as slow is at the start of the loop that mean if fast.next is slow that means fast is
            // at the end of the linked list
            while(fast.next!=slow){
                fast=fast.next;
            }

            // Make fast null
            fast.next=null;
            return;
        }
*/
    }
}