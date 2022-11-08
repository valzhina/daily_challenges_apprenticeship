import java.util.HashMap;
import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        System.out.println(postFixExpression("231*+9-"));
        System.out.println(postFixExpression("23+"));
    }

//    public static int postFixExpression(String s) {
//        Stack<Integer> stack = new Stack<Integer>();
//        int temp1,temp2;
//        for (int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '-') {
//                temp1 = stack.pop();
//                temp2 = stack.pop();
//                stack.push(temp2 - temp1);
//            }
//            else if(s.charAt(i) == '+'){
//                temp1 = stack.pop();
//                temp2 = stack.pop();
//                stack.push(temp2 + temp1);
//                }
//            else if(s.charAt(i) == '*'){
//                temp1 = stack.pop();
//                temp2 = stack.pop();
//                stack.push(temp2 * temp1);
//                }
//            else if(s.charAt(i) == '/'){
//                temp1 = stack.pop();
//                temp2 = stack.pop();
//                stack.push(temp2 / temp1);
//                }
//            else{
//                temp1 = Character.getNumericValue(s.charAt(i));
//                stack.push(temp1);
//            }
//            System.out.println(stack.toString());
//        }
//        return stack.pop();
//    }


    public static int postFixExpression(String s) {

        Stack<Integer> charStack = new Stack<Integer>();
        int temp;

        for(char token : s.toCharArray()){
            switch(token){
                case'0':
                case'1':
                case'2':
                case'3':
                case'4':
                case'5':
                case'6':
                case'7':
                case'8':
                case'9':
                    charStack.push(Character.getNumericValue(token));
                    break;
                case '+':
                    charStack.push(charStack.pop() + charStack.pop());
                    break;
                case '-':
                    temp = charStack.pop();
                    charStack.push(charStack.pop() - temp);
                    break;
                case '*':
                    charStack.push(charStack.pop() * charStack.pop());
                    break;
                case '/':
                    temp = charStack.pop();
                    charStack.push(charStack.pop() / temp);
                    break;
                case '%':
                    temp = charStack.pop();
                    charStack.push(charStack.pop() % temp);
                    break;
            }
        }
        return charStack.pop();
    }
}
