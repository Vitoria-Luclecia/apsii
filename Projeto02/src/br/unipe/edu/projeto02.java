package br.unipe.edu;

public class projeto02 {
	public static void main(String[]args){

        Banco b1 = new Banco("Vitória", "111", 30);
        Banco b2 = new Banco();
        
        //Exercício 
        Banco b3 = new Banco("jose", "222", 5);
        System.out.println(b3.getNome());
        b3.setNome("Joaquim");
        System.out.println(b3.getNome());
    }
}
