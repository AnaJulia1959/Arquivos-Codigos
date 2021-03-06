#Arquivos-Codigos
//Altere o construtor da classe carro para que ele inicie o tanque com 0.

public class carro{
	private String marca;
	private String modelo;
	private int ano;
	private float tanque;
	private float odometro;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getTanque() {
		return tanque;
	}
	public void setTanque(float tanque) {
		this.tanque = tanque;
	}
	public float getOdometro() {
		return odometro;
	}
	public void setOdometro(float odometro) {
		this.odometro = odometro;
	}
	
	public void ligarCarro(){
		System.out.println("Carro Ligado!");
	}
	public carro (String marca, String modelo, int ano, float tanque, float odometro){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setTanque(0);
		this.setOdometro(0);
	}
	public float abastecer (float litros) {
		if (tanque + litros <= 45) {
			this.tanque = tanque + litros;
			System.out.println("Okay, " + litros + " litros foram abastecidos.");
		}else {
			System.out.println("Alerta: capacidade máxima obtida!");
		}
		return tanque;
	}
	public void andar (float quanto, float velocidade){
		this.ligarCarro();
		float valor_gasto = quanto / 10;
		if(tanque >= valor_gasto) {
			odometro  = velocidade;
			System.out.println("Andando " + quanto + " km.");
			this.tanque = tanque - valor_gasto;
		}else {
			System.out.println("Alerta: tanque vazio, você ficou parado na estrada!");
		}
	}
	public void status(String marca, String modelo, int ano, float tanque, float odometro) {
		System.out.printf("%n---------- DADOS DO VEÍCULO-----------");
		System.out.printf("%nMarca: %s", marca);
		System.out.printf("%nModelo: %s", modelo);
		System.out.printf("%nAno: %d%n", ano);
		System.out.println("Tanque: " + tanque + " L");
		System.out.println("Odômetro: " + odometro + " Km/h");
	}

}
