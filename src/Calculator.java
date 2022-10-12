import java.util.Stack;

public class Calculator {

    private Stack<Double> history = new Stack<Double>();
    private double value = 0.0;
    
    public double process(String input){
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

    public double getValue(){return value;}
}