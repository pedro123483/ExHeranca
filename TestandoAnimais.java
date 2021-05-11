package Exercicio;

public class TestandoAnimais {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica bicho = new Preguica();
		
		cao.setNome("Scooby");
		cao.setIdade(5);
		cao.setSom("AU AU");
		cao.setCorrer("O cachorro está correndo...");
		
		cavalo.setNome("Ventania");
		cavalo.setIdade(10);
		cavalo.setSom("hinn in in");
		cavalo.setCorrer("O cavalo está correndo...");
		
		bicho.setNome("Preguicinha");
		bicho.setIdade(15);
		bicho.setSom("HAAAAAM");
		bicho.setSubirArvore("O Preguicinha está subindo na árvore...");
		
		System.out.println("==CACHORRO==");
		System.out.println("Nome: " + cao.getNome());
		System.out.println("Idade: " + cao.getIdade());
		System.out.println("Som: " + cao.getSom());
		System.out.println(": " + cao.getCorrer());
		
		System.out.println("\n==CAVALO==");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Som: " + cavalo.getSom());
		System.out.println(": " + cavalo.getCorrer());
		
		System.out.println("\n==BICHO PREGUIÇA==");
		System.out.println("Nome: " + bicho.getNome());
		System.out.println("Idade: " + bicho.getIdade());
		System.out.println("Som: " + bicho.getSom());
		System.out.println(": " + bicho.getSubirArvore());
		
		
		
		
		
		

	}

}
