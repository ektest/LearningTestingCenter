package lambdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 2 type Stream
// Sequential stream -> not multi-thread
// Parallel stream -> multi-thread

public class ExamManager {
    private List<Double> myScores;

    public ExamManager() {
        myScores = new ArrayList<Double>();
        myScores.add(78.0);
        myScores.add(78.3);
        myScores.add(78.6);
        myScores.add(78.9);
    }

    public void PrintSelectedScores() {
        myScores.stream().filter(s -> s >= 78.5).forEach(s -> System.out.println(s));
    }

    /*
    public double getTotalOfAllScores() {
        Double total = 0d;
        // Lambda can't change value of local variables inside of lambda code
        // block! So below code will not compile
        myScores.forEach(s -> total += s);
        return total;
    }
    */

    public double getTotalOfAllScores() {
        Stream<Double> myScoresStream = myScores.stream();
        return myScoresStream.reduce(0d, (a, b) -> a + b);
    }

    public List<Double> doubleAllScores(){
        return myScores.stream().map(d -> d * 2).collect(Collectors.toList());
    }
}
