import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){
        String s="(a + (b -c) +z) - z)";
        System.out.println(valid(s));

        String s1="(a + (b -c) +z - z)";
        System.out.println(valid(s1));//true
        String s2="((a + (b -c) +z - z)";
        System.out.println(valid(s2));//false
        String s3="(a + {b -c)  +z}";
        System.out.println(valid(s3));//false
        String s4="y + (a + (b -c) +z - z)";
        System.out.println(valid(s4));//true
        String s5="{y+(a+b)+c}";
        System.out.println(valid(s5));
        String s6="{y+{a+b)+c}";
        System.out.println(valid(s6));
        String s7="({)}";
        System.out.println(valid(s7));
        String s8="({[]})";
        System.out.println(valid(s8));


    }
    public static boolean valid(String s){
        Stack<Character> result=new Stack<> ();

        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                result.push(c);

            }else{
                if(c==')' || c=='}' || c==']'){
                    if(result.isEmpty()){
                        return false;
                    }
                    char top = result.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                        result.pop(); // pop the matching opening bracket
                    } else {
                        return false; // mismatched brackets
                    }

                }
            }
        }
       return result.isEmpty();
    }
}
