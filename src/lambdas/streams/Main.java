package lambdas.streams;

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

public class Main {
    public static void main(String[] args) {
        ExamManager ex = new ExamManager();
        ex.PrintSelectedScores();
        System.out.println("###");
        ex.doubleAllScores().forEach(s -> System.out.println(s));
    }
}
