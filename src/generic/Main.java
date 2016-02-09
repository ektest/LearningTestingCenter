package generic;

public class Main {
	public static void main(String[] args) {
		StringWorker<String, String> worker = new StringWorker<String, String>("A", "B");
		worker.toString();
		printObject(worker);
		StringWorker<String, Integer> worker2 = new StringWorker<String, Integer>("A", 123);
		worker2.toString();
		printObject(worker2);
	}
	public static <T, U> void printObject(StringWorker<T,U> worker){
		System.out.println(worker.toString());
	}
}
