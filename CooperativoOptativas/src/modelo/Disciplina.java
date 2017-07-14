package modelo;

public class Disciplina {
	private int id;
	private String nome;
	//pontuação da disciplina em dada categoria
	private double cat1; //Engenharia de Software baseada no processo
	private double cat2; //Engenharia de Software baseada no projeto
	private double cat3; //Programação
	private double cat4; //Hardware e Redes
	private double cat5; // Matemática e Algoritmos
	private double cat6; //Sem categoria
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCat1() {
		return cat1;
	}
	public void setCat1(double cat1) {
		this.cat1 = cat1;
	}
	public double getCat2() {
		return cat2;
	}
	public void setCat2(double cat2) {
		this.cat2 = cat2;
	}
	public double getCat3() {
		return cat3;
	}
	public void setCat3(double cat3) {
		this.cat3 = cat3;
	}
	public double getCat4() {
		return cat4;
	}
	public void setCat4(double cat4) {
		this.cat4 = cat4;
	}
	public double getCat5() {
		return cat5;
	}
	public void setCat5(double cat5) {
		this.cat5 = cat5;
	}
	public double getCat6() {
		return cat6;
	}
	public void setCat6(double cat6) {
		this.cat6 = cat6;
	}
	
}
