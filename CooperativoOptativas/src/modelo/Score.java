package modelo;

public class Score {
	private int id;
	private int disciplina_id;
	private int categoria_id;
	private int aluno_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDisciplina_id() {
		return disciplina_id;
	}
	public void setDisciplina_id(int disciplina_id) {
		this.disciplina_id = disciplina_id;
	}
	public int getCategoria_id() {
		return categoria_id;
	}
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	public int getAluno_id() {
		return aluno_id;
	}
	public void setAluno_id(int aluno_id) {
		this.aluno_id = aluno_id;
	}
}
