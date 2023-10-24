public class ExemploVetores {
    public static void main(String[] args) {
        // Vetores são coleções que armazenam várias variáveis e dados dentro de si.
        // Com os colchetes, fazemos a tipagem do vetor/array, abaixo, declaramos um
        // array de strings através do construtor "new".
        // É uma boa prática declarar a capacidade em uma variável, para que assim
        // possamos atualizá-la automaticamente quando for conveniente:
        int cap = 10;
        String[] nomes = new String[cap]; // => Dentro dos colchetes à direita, declaramos o comprimento, ou seja,
        // quantos elementos poderemos armazenar no vetor.
        // Um outro modo de realizar essa declaração seria:
        // String[] nomes = new String[10];
        // Assim como as strings, os vetores iniciam na posição 0.
        nomes[1] = "Davi";
        // Vamos, abaixo, fazer uma repetição para iterar todos os elementos do array
        for (int i = 0; i <= nomes.length; i++) { // Passaremos "i" como índice para esse array
            System.out.println("Nome nº " + i + " :" + nomes[i]);
        }
        // O sistema irá imprimir null antes de "Davi", pois o primeiro índice do array
        // é o 0.
    }
}