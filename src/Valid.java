import java.util.Stack;

public class Valid {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s1="({}[])";
        String s2="(()";
        System.out.println("Check is :" +findIsValid(s1));
        System.out.println("Check is :" +findIsValid(s2));

    }
    public static boolean findIsValid(String s) {
        Stack<Character> result=new Stack<>();
        for(char c:s.toCharArray()) {
            if(c =='(' || c=='{' || c=='[') {
                result.push(c);
                System.out.println(result);

            }else if(c==')' || c=='}' || c==']') {
                if(result.isEmpty()) {
                    return false;
                }
                char top=result.pop();
                if(c==')' && top!='(' || c=='}' && top != '{' || c==']' && top!='[') {
                    return false;
                }
            }
        }
        return result.isEmpty();
    }
}
