package composicionHerencia;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		AlumnoRegular alumno1 = new AlumnoRegular();
        AlumnoBecario alumno2 = new AlumnoBecario();
        AlumnoIntercambio alumno3 = new AlumnoIntercambio();
        
        alumno1.setPromedio(8.5);
        alumno1.setMateriasFavoritas(Arrays.asList("Matemáticas", "Física"));
        alumno1.setHorario("Lunes a viernes, 8:00 AM - 2:00 PM");

        alumno2.setTipoBeca("Beca académica");
        alumno2.setResponsabilidades(Arrays.asList("Apoyar en la biblioteca", "Participar en eventos"));
        alumno2.setDuracionBeca(1);

        alumno3.setPaisOrigen("España");
        alumno3.setUniversidadOrigen("Universidad de Cataluña");
        alumno3.setDuracionIntercambio(1);
        // ...
        
        // Realizar acciones comunes
        alumno1.asistirAClase();
        alumno2.estudiar();
        alumno3.asistirAClase();
        
        System.out.println("Promedio del alumno regular: " + alumno1.getPromedio());
        System.out.println("Responsabilidades del alumno becario: " + alumno2.getResponsabilidades());
        System.out.println("País de origen del alumno de intercambio: " + alumno3.getPaisOrigen());

	}

}
