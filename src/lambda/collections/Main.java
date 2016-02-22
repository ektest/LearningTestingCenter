package lambda.collections;

//Functional Interfaces
//Category    | Parameters    | Return                | Method
//Consumer    | Yes           | No                    | accept()
//Supplier    | No            | Yes                   | get()
//Function    | Yes           | Yes                   | apply()
//Predicate   | Yes           | Yes (must be Boolean) | test()

public class Main {
    public static void main(String[] args) {
        ExamManager ex = new ExamManager();
        ex.PrintScores();
        System.out.println("####");
        ex.PrintSelectedScores(s -> s >= 78.5);
        System.out.println("####");
        ex.PrintSelectedScores(Main::isItLowerthan78AndHalf);
    }

    // This is regular java method but like predicate so we can use this as
    // lambda exp see above
    private static Boolean isItLowerthan78AndHalf(Double d) {
        if (d < 78.5)
            return true;
        return false;
    }
}
