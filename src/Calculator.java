import java.util.Stack;

public class Calculator {

    private static Stack<Double> history = new Stack<Double>();
    private static double value = 0.0;
    
    public static Double process(String input){
        try{
            history.push(Double.parseDouble(input));
            return null;
        }catch(Exception e){
            if(input == "+")
                value = history.pop() + history.pop();
            else if(input == "-")
                value = -1 * (history.pop() - history.pop());
            else if(input == "*")
                value = history.pop() * history.pop();
            else if(input == "/"){
                double a = history.pop();
                value = history.pop() / a;
            }
        }

        return value;
    }

    public static double getValue(){return value;}

    // interface Operand{
    //     double apply(Stack<Double> stack);
    // }

    // enum Operands implements Operand{
    //     ADD("+"){
    //         @Override
    //         public double apply(Stack<Double> stack){
    //             return stack.pop() + stack.pop();
    //         }
    //     }
    // }
}