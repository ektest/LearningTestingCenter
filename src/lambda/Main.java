package lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

import javax.xml.ws.handler.MessageContext.Scope;

//Functional Interfaces
//Category    | Parameters    | Return                | Method
//Consumer    | Yes           | No                    | accept()
//Supplier    | No            | Yes                   | get()
//Function    | Yes           | Yes                   | apply()
//Predicate   | Yes           | Yes (must be Boolean) | test()

// Lambda can't change value of local variables inside of lambda code block!

public class Main {
    public static void main(String[] args) {
        // First way to do with lambda
        ExamManager.CalculationFunctionInterface avarage = myScores -> {
            Double sum = 0d;
            for (Double next : myScores) {
                sum += next;
            }
            return sum / myScores.size();
        };
        ExamManager ex = new ExamManager();
        System.out.println("The average score is " + ex.customCalculation(avarage));
        // Second way to do with lambda using bultin function
        Function<List<Double>, Double> highestScore = myScores -> {
            Double highest = 0d;
            for (Double next : myScores) {
                highest = Math.max(highest, next);
            }
            return highest;
        };
        System.out.println("The average score is " + ex.customCalculation(highestScore));
        // Third way to do with lambda using bultin function
        ToDoubleFunction<List<Double>> highestScore2 = myScores -> {
            Double highest = 0d;
            for (Double next : myScores) {
                highest = Math.max(highest, next);
            }
            return highest;
        };
        System.out.println("The average score is " + ex.customCalculation(highestScore2));
        // Another example using short-cut
        System.out.println("The first score is " + ex.customCalculation2(myScores -> myScores.get(0)));
    }
}
