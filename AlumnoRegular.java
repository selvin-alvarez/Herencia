package composicionHerencia;

import java.util.List;

public class AlumnoRegular extends Persona {
	
	private double promedio;
	private List<String> materiasFavoritas;
    private String horario;
    
    public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public List<String> getMateriasFavoritas() {
		return materiasFavoritas;
	}

	public void setMateriasFavoritas(List<String> materiasFavoritas) {
		this.materiasFavoritas = materiasFavoritas;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	

	@Override
	void asistirAClase() {
		System.out.println("El alumno regular está asistiendo a clase.");

	}

	@Override
	void estudiar() {
		System.out.println("El alumno regular está estudiando.");

	}

}
