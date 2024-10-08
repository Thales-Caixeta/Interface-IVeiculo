public class Veiculo implements IVeiculo {

protected int velocidade;

protected String placa;

protected String chassi;

protected int ano;

public double calcularValorVendaVeiculo(Veiculo veiculo) {

return 10000.0;

}

@Override

public void ligar() {

System.out.println("Veículo ligado.");

}

@Override

public void desligar() {

System.out.println("Veículo desligado.");

}

@Override

public void acelerar(int velocidade) {

this.velocidade += velocidade;

System.out.println("Acelerando. Velocidade atual: " + this.velocidade + " km/h");

}

@Override

public void frear(int velocidade) {

this.velocidade -= velocidade;

if (this.velocidade < 0) this.velocidade = 0;

System.out.println("Freando. Velocidade atual: " + this.velocidade + " km/h");

}

public int getVelocidade() {

return velocidade;

}

public String getPlaca() {

return placa;

}

public void setPlaca(String placa) {

this.placa = placa;

}

public String getChassi() {

return chassi;

}

public void setChassi(String chassi) {

this.chassi = chassi;

}

public int getAno() {

return ano;

}

public void setAno(int ano) {

this.ano = ano;

}

}
