package ut.utils;

public class Pair<T, V> {

	private T t;
	private V v;

	public Pair(T t, V v) {
		this.t = t;
		this.v = v;
	}

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setV(V v) {
		this.v = v;
	}

	public V getV() {
		return v;
	}
}
