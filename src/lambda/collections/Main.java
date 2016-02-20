package lambda.collections;

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
        ex.PrintScores();
        System.out.println("####");
        ex.PrintSelectedScores(s -> s >= 78.5);
    }
}
