package fatec.edu.fila.berto;

public class Fila<T> {

	No<T> inicio;
	No<T> fim;
	int size;

	public boolean isEmpty() {

		if (inicio == null && fim == null) {

			return true;

		}

		return false;
	}

	public void insert(T dado) {

		No<T> elemento = new No<T>();
		elemento.dado = dado;

		if (isEmpty()) {

			inicio = elemento;

		} else {

			elemento.proximo = fim;

		}

		fim = elemento;
		size++;

	}

	public T remove() throws Exception {

		if (isEmpty()) {

			throw new Exception("Fila vazia");

		}

		T dado = inicio.dado;

		inicio = inicio.proximo;

		if (inicio == null) {

			fim = null;

		}

		size--;

		return dado;

	}

	public int size() {

		return size;

	}

	public void list() throws Exception {

		if (isEmpty()) {

			throw new Exception("Fila vazia");

		}

		No<T> auxiliar = inicio;

		while (auxiliar != null) {

			System.out.println(auxiliar.toString() + " ");

			auxiliar = auxiliar.proximo;

		}

	}

}
