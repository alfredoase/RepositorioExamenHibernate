public class Grupo {
	private int idGrupo;
	private String nombre;
	private String estilo;
	private int miembros;	
	private Festival festival;
	private Actuacion actuacion;
	
	public Grupo() {
		
	}
	
	public Grupo(int idGrupo, String nombre, String estilo, int miembros, Festival festival) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.estilo = estilo;
		this.miembros = miembros;
		this.festival = festival;
	}
	
	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getMiembros() {
		return miembros;
	}
	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}
	
	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public Actuacion getActuacion() {
		return actuacion;
	}

	public void setActuacion(Actuacion actuacion) {
		this.actuacion = actuacion;
	}
	
}
