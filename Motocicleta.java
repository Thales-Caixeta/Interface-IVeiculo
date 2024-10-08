public class Motocicleta extends Veiculo {

@Override

public void acelerar(int velocidade) {

super.acelerar(velocidade);

System.out.println("Motocicleta acelerando.");

}

@Override

public void frear(int velocidade) {

super.frear(velocidade);

System.out.println("Motocicleta freando.");

}

}
