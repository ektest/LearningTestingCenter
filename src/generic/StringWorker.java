package generic;

public class StringWorker<T,U> {
	private T o1;
	private U o2;

	public StringWorker(T o1, U o2){
		this.o1 = o1;
		this.o2 = o2;
	}

	public T getO1(){
		return this.o1;
	}

	@Override
	public String toString() {
		return "StringWorker [o1=" + o1 + ", o2=" + o2 + "]";
	}
}
