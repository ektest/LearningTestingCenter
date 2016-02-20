package lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExamManager {
    private List<Double> myScores;

    public ExamManager() {
        myScores = new ArrayList<Double>();
        myScores.add(78.0);
        myScores.add(78.3);
        myScores.add(78.6);
        myScores.add(78.9);
    }

    public void PrintScores() {
        // old way to do it
        // Collections.sort(myScores, new DescendingComparator());
        // new way to do it using lambda exp
        Collections.sort(myScores, (o1, o2) -> {
            int result = 0;
            if (o1 < 02)
                result = 1;
            else if (o2 < o1)
                result = -1;
            return result;
        });
        myScores.forEach(score -> System.out.println(score));

    }

    // Using Lambda
    public void PrintSelectedScores(Predicate<Double> selection) {
        myScores.forEach(s -> {
            if (selection.test(s)) {
                System.out.println(s);
            }
        });
    }

    // Using Lambda and Stream
    public void PrintSelectedScoresStrem(Predicate<Double> selection) {
        myScores.stream().filter(selection).forEach(s -> System.out.println(s));
    }
}
