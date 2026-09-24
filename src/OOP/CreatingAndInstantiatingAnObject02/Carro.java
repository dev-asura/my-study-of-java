package OOP.CreatingAndInstantiatingAnObject02;

public class Carro {

    //atributos
    String modelo;
    String marca;
    int ano;
    int velocidade;

    //metodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }

    void frear(int reduzir){
        velocidade -= reduzir;
    }

    void buzinar(){
        System.out.println("BIIIII BIIIIIIII");
    }
}
