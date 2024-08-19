package composicionHerencia;

public class AlumnoIntercambio extends Persona {
	
	private String paisOrigen;
	private String universidadOrigen;
    private int duracionIntercambio;
    
    public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getUniversidadOrigen() {
		return universidadOrigen;
	}

	public void setUniversidadOrigen(String universidadOrigen) {
		this.universidadOrigen = universidadOrigen;
	}

	public int getDuracionIntercambio() {
		return duracionIntercambio;
	}

	public void setDuracionIntercambio(int duracionIntercambio) {
		this.duracionIntercambio = duracionIntercambio;
	}

	

	@Override
	void asistirAClase() {
		System.out.println("El alumno de intercambio está asistiendo a clase.");

	}

	@Override
	void estudiar() {
		System.out.println("El alumno de intercambio está estudiando.");

	}

}
