package OOP.CreatingAndInstantiatingAnObject02;

public class CarroTestar {

    public static void main(){

        Carro carro01 = new Carro();

        carro01.marca = "Porsche";
        carro01.modelo = "911 Carrera";
        carro01.velocidade = 60;

        System.out.println("O carro esta a " + carro01.velocidade + "km/h.");
        System.out.println();

        System.out.println("O carro esta acelerando...");
        carro01.acelerar(50);
        System.out.println("O carro esta a " + carro01.velocidade + "km/h.");
        System.out.println();

        System.out.println("Radar se aproximando. Reduzindo velocidade...");
        carro01.frear(30);
        System.out.println("O carro esta a " + carro01.velocidade + "km/h.");
    }
}
