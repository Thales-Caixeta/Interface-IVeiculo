public class Automovel extends Veiculo {

private String cor;

public String getCor() {

return cor;

}

public void setCor(String cor) {

this.cor = cor;

}

@Override

public void acelerar(int velocidade) {

super.acelerar(velocidade);

System.out.println("Automóvel acelerando.");

}

@Override

public void frear(int velocidade) {

super.frear(velocidade);

System.out.println("Automóvel freando.");

}

}
