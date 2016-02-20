package lambda.collections;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        int result = 0;
        if (o1 < 02)
            result = 1;
        else if (o2 < o1)
            result = -1;
        return result;
    }

}
