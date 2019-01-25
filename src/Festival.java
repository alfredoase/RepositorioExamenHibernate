import java.util.ArrayList;
import java.util.List;

public class Festival {
	private int idFestival;
	
	private String nombre;
	private String lugar;
	private String fecha;
	private List<Grupo> listaGrupos = new ArrayList<Grupo>();

	public Festival() {

	}

	public Festival(int idFestial, String nombre, String lugar, String fecha, List<Grupo> listaGrupos) {
		super();
		this.idFestival = idFestival;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
		this.listaGrupos = listaGrupos;
	}
	
	public int getIdFestival() {
		return idFestival;
	}

	public void setIdFestival(int idFestival) {
		this.idFestival = idFestival;
	}
	
	public List<Grupo> getListaGrupos() {
		return listaGrupos;
	}
	public void setListaGrupos(List<Grupo> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}
	public void addGrupo(Grupo grupo) {
		grupo.setFestival(this);
		this.listaGrupos.add(grupo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

}
