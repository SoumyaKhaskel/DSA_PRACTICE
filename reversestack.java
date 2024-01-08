import java.util.*;
public class reversestack {
    public static void pushAtbottom(Stack<Integer>s,int data)
    { 
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }
    public static void printstack(Stack<Integer>s)
    {
        while(!s.isEmpty())
         {
           System.out.println(s.peek());
           s.pop();
         }
    }
    public static void main(String[] args) {
         Stack<Integer>s=new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         reverseStack(s);
         printstack(s);
    }
}
