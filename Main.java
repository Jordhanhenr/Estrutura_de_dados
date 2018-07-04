package arvores;

import java.security.SecureRandom;

public class Main {
	
	public static final int MAX = 100000000;
	static SecureRandom random = new SecureRandom(); // gerar numeros aleatórios
	static int media_t = 0;
	
	public static void main(String[] args) {
		testAVL();
		testRB();
	}

	public static void testAVL() {
		int[] array = new int[MAX];
		int x = 0;
		ArvoreAVL arvore = new ArvoreAVL();
		//Medindo tempo de 100 inserções aleatórias na arvore avl
		for(int j =0;j<10;j++) {
			arvore.clear();
			long start = System.currentTimeMillis();
			for(int i =0;i<100;i++)
				arvore.inserir(random.nextInt(MAX));
			long end = System.currentTimeMillis();
			System.out.println(end - start);
			media_t += end - start;
		}
		System.out.println("Média de 100 inserções na arvore avl  "+media_t/10+"ms");
		media_t = 0;
		//Medindo tempo de 1000 inserções aleatórias na arvore avl
				for(int j =0;j<10;j++) {
					arvore.clear();
					long start = System.currentTimeMillis();
					for(int i =0;i<1000;i++)
						arvore.inserir(random.nextInt(MAX));
					long end = System.currentTimeMillis();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de 1000 inserções na arvore avl  "+media_t/10+"ms");
		media_t = 0;	
		///Medindo tempo de 10000 inserções aleatórias na arvore avl
				for(int j =0;j<10;j++) {
					arvore.clear();
					long start = System.currentTimeMillis();
					for(int i =0;i<10000;i++)
						arvore.inserir(random.nextInt(MAX));
					long end = System.currentTimeMillis();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de 10000 inserções na arvore avl  "+media_t/10+"ms");
		media_t = 0;
		//Medindo tempo de busca de uma chave aleatória na arvore avl
				for(int j =0;j<10;j++) {
					x = random.nextInt(100);
					long start = System.nanoTime();
					arvore.search(x);
					long end = System.nanoTime();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de busca de uma chave aleatória na arvore avl em nanosecundos "+media_t/10);
	}
	
	private static void testRB() {
	    Arvore a = new Arvore();
	    int x = 0;
		
		//Medindo tempo de 100 inserções aleatórias na arvore RB
		for(int j =0;j<10;j++) {
			long start = System.currentTimeMillis();
			for(int i =0;i<100;i++)
				a.adiciona(random.nextInt(MAX));
			long end = System.currentTimeMillis();
			System.out.println(end - start);
			media_t += end - start;
		}
		System.out.println("Média de 100 inserções na arvore RB  "+media_t/10+"ms");
		media_t = 0;
		//Medindo tempo de 1000 inserções aleatórias na arvore RB
				for(int j =0;j<10;j++) {
					long start = System.currentTimeMillis();
					for(int i =0;i<1000;i++)
						a.adiciona(random.nextInt(MAX));
					long end = System.currentTimeMillis();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de 1000 inserções na arvore RB  "+media_t/10+"ms");
		media_t = 0;	
		//Medindo tempo de 10000 inserções aleatórias na arvore RB
				for(int j =0;j<10;j++) {
					long start = System.currentTimeMillis();
					for(int i =0;i<10000;i++)
						a.adiciona(random.nextInt(MAX));
					long end = System.currentTimeMillis();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de 10000 inserções na arvore RB  "+media_t/10+"ms");
		media_t = 0;
		//Medindo tempo de busca de uma chave aleatória na arvore avl
				for(int j =0;j<10;j++) {
					x = random.nextInt(100);
					long start = System.nanoTime();
					a.encontra(x);
					long end = System.nanoTime();
					System.out.println(end - start);
					media_t += end - start;
				}
				System.out.println("Média de busca de uma chava na arvore RB em nanosecundos "+media_t/10);
		
		
	}
}
