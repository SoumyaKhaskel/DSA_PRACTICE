import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class stackp {
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
    public static String reverseString(String str)
    {
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res=new StringBuilder();
        while(!s.isEmpty())
        {
          char curr=s.pop();
          res.append(curr);
        }
        return res.toString();
    }
    public static void main(String[] args) {
       /*  Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtbottom(s, 4);
        hile(!s.isEmpty())
        {
          System.out.println(s.peek());
          s.pop();
        }*/
        String str="hellow";
        String result=reverseString(str);
        System.out.println(result);
      }
}
