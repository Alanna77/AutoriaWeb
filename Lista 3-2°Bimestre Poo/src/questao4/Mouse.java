package questao4;

public class Mouse extends Produto{
	private String tipo;
	
	
	public Mouse(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return "Descrição: "+ descricao+" - " + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
