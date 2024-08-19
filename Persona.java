package composicionHerencia;

abstract class Persona {
	
	private String nombre;
    private String listaClases;
    private int grado;
    private String seccion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getListaClases() {
		return listaClases;
	}

	public void setListaClases(String listaClases) {
		this.listaClases = listaClases;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void asistirAClase(); // Método abstracto
    abstract void estudiar(); // Método abstracto
	
}
