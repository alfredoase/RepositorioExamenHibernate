public class Actuacion {
	private int idActuacion;
	private String hora;
	private String escenario;	
	private Grupo grupo;
	
	public Actuacion() {

	}
		
	public Actuacion(int idActuacion, String hora, String escenario, Grupo grupo) {
		super();
		this.idActuacion = idActuacion;
		this.hora = hora;
		this.escenario = escenario;
		this.grupo = grupo;
	}

	public int getIdActuacion() {
		return idActuacion;
	}
	public void setIdActuacion(int idActuacion) {
		this.idActuacion = idActuacion;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEscenario() {
		return escenario;
	}
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}	
	
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
