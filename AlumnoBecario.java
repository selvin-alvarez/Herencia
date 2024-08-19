package composicionHerencia;

import java.util.List;

public class AlumnoBecario extends Persona {
	
	private String tipoBeca;
	private List<String> responsabilidades;
    private int duracionBeca;
    
    public String getTipoBeca() {
		return tipoBeca;
	}

	public void setTipoBeca(String tipoBeca) {
		this.tipoBeca = tipoBeca;
	}

	public List<String> getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(List<String> responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public int getDuracionBeca() {
		return duracionBeca;
	}

	public void setDuracionBeca(int duracionBeca) {
		this.duracionBeca = duracionBeca;
	}


	@Override
	void asistirAClase() {
		System.out.println("El alumno becario está asistiendo a clase.");

	}

	@Override
	void estudiar() {
		System.out.println("El alumno becario está estudiando.");

	}

}
