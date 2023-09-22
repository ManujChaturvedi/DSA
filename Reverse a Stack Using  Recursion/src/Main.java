import java.util.Stack;

public class Main {

    static void insertab(Integer x, Stack<Integer> s){

        // Agar khali hai to add kardo element ko, nahi to sare hatao fir add karo ---
        if(s.isEmpty()){
            s.push(x);
        }else{
            Integer temp=s.pop();
            insertab(x,s);
            s.push(temp);
        }

    }

    static void reverse(Stack<Integer> s)
    {
        // Till it dosen't get empty keep poping element and save them:
        if(s.size()>0){
            Integer x = s.pop();
            reverse(s);
            insertab(x,s);
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}