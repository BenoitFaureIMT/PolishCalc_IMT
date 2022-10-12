import java.util.Stack;

public class Calculator {

    private static Stack<Double> history = new Stack<Double>();
    private static double value = 0.0;
    
    public static double process(String input){
        try{
            history.push(Double.parseDouble(input));
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
}