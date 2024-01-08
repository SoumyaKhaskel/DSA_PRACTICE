import java.text.CharacterIterator;
import java.util.*;
public class Validparenthesis {
    public static boolean isValid(String str)
    {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){//opening brackets
                s.push(ch);
            }else{//closing
                if(s.isEmpty())
                {
                    return false;
                }
                if((s.peek()=='(' && ch==')')//()
                ||(s.peek()=='{' && ch=='}')//{}
                ||(s.peek()=='[' && ch==']'))//[]
                {s.pop();}
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty())
        {
            return true;
       }
        else{return false;
        }
    }
    public static boolean isDuplicate(String str) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==')')
            {
                int count=0;
                while(s.pop()!='(')//as all entered strings will be valid strings
                {
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
            }else{//opening brackets
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";//should return true
        System.out.println(isDuplicate(str));
    }
}
