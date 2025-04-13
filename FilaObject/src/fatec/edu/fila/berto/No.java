package fatec.edu.fila.berto;

public class No<T> {

	T dado;
	No<T> proximo;

	@Override
	public String toString() {
		return "Dado [" + dado + "]";
	}

}
