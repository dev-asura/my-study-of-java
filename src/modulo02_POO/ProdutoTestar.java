package modulo02_POO;

public class ProdutoTestar {
    public static void main(String[] args){

        Produto produto01 = new Produto("Macarrao");
        Produto produto02 = new Produto("Mostarda", "Heinz");
        Produto produto03 = new Produto("Mussarela", "Vigor", 49.90F);

        System.out.println(produto01.nome);
        System.out.println(produto02.nome + " " + produto02.marca);
        System.out.println(produto03.nome + " " + produto03.marca + " " + produto03.valor + "/kg.");



    }
}
