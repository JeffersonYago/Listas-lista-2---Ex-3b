package controller;
import model.Lista;
import br.edu.fateczl.pilhaint.Pilha;
public class Ex3bController {

	public Ex3bController() {
		super();
	}
	
	public void carregarLista(){
		Lista<Integer> lista = new Lista<>();
		try {
		lista.addFirst(3);
		lista.addLast(5);
		lista.addLast(8);
		lista.addLast(12);
		lista.addLast(9);
		lista.addLast(7);
		lista.addLast(6);
		lista.addLast(2);
		lista.addLast(3);
		lista.addLast(7);
		lista.addLast(16);
		
	}catch (Exception e) {	
	}
		manipulaLista(lista);
}

	private void manipulaLista(Lista<Integer> lista) {
	Pilha pi = new Pilha();
	try {
	int maior = lista.get(0);
	int menor = maior;
	pi.push(lista.get(0));
	lista.removeFirst();
	while(!lista.isEmpty()) {
		int aux = lista.get(0);
		if(aux > maior) {
			maior = aux;
		}
		pi.push(aux);
		lista.removeFirst();
	}
	while(!pi.isEmpty()) {
		if(pi.top() > menor && pi.top() < maior) {
			menor = pi.top();
			pi.pop();
		}else {
		pi.pop();
		}
	}
	System.out.println("maior valor: "+maior+"\nsegundo maior: "+menor);
	}catch (Exception e) {
	}
  }
}