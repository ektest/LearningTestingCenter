package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class ExamManager {
    public interface CalculationFunctionInterface {
        public Double excute(List<Double> scores);
    }

    private List<Double> myScores;

    public ExamManager() {
        myScores = new ArrayList<Double>();
        myScores.add(78.0);
        myScores.add(78.3);
        myScores.add(78.6);
        myScores.add(78.9);
    }

    public Double customCalculation(CalculationFunctionInterface calculator) {
        return calculator.excute(this.myScores);
    }

    // We are using built-in functionality so no need to create our own
    // interface first type is input and second type is output
    public Double customCalculation(Function<List<Double>, Double> calculator) {
        return calculator.apply(this.myScores);
    }

    // another one see javadoc for more
    public Double customCalculation(ToDoubleFunction<List<Double>> calculator) {
        return calculator.applyAsDouble(this.myScores);
    }

    // declared this to avoid conflict since we are going to use short-cut for
    // lambda exp
    public Double customCalculation2(ToDoubleFunction<List<Double>> calculator) {
        return calculator.applyAsDouble(this.myScores);
    }
}
