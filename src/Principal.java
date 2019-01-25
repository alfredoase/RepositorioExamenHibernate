
import org.hibernate.Session;

public class Principal {
	
	public static void main(String[] args) {
			
	Session session = HibernateUtilities.getSessionFactory().openSession();	
	
	//Metodo introducir datos.
	IntroducirDatos(session);
	
	session.close();
	
	HibernateUtilities.getSessionFactory().close();
	
	}
	
	public static void IntroducirDatos(Session session) {
		
		/*A�adimos el primer festival*/

		session.beginTransaction();

		Festival f1 = new Festival();
		f1.setNombre("Monsters of Rock");
		f1.setLugar("Zaragoza");
		f1.setFecha("08-2015");
		
		Grupo g1 = new Grupo();
		g1.setNombre("Twisted Sister");
		g1.setEstilo("Glam Metal");
		g1.setMiembros(5);
		
		Actuacion a1 = new Actuacion();
		a1.setHora("22:00");
		a1.setEscenario("Principal");
		
		Grupo g2 = new Grupo();
		g2.setNombre("Saxon");
		g2.setEstilo("Hard Rock");
		g2.setMiembros(5);
		
		Actuacion a2 = new Actuacion();
		a2.setHora("20:00");
		a2.setEscenario("Principal");
		
		
		
		/* TODO:
		 * A�adir g1 y g2 en el festival f1
		 * Enlazar g1 con a1 y g2 con a2
		 */
		
		//Grupo 1 y grupo 2, a�adidos.
		g1.setActuacion(a1);
		g2.setActuacion(a2);
		
		f1.addGrupo(g1);
		f1.addGrupo(g2);
		
		
		
		session.save(f1);
		
		session.getTransaction().commit();
		
		/*A�adimos el segundo festival*/

		session.beginTransaction();

		f1 = new Festival();
		f1.setNombre("Metal Fest");
		f1.setLugar("Barcelona");
		f1.setFecha("07-2016");
		
		g1 = new Grupo();
		g1.setNombre("Judas Priest");
		g1.setEstilo("Speed Metal");
		g1.setMiembros(5);
		
		a1 = new Actuacion();
		a1.setHora("22:00");
		a1.setEscenario("Principal");
		
		g2 = new Grupo();
		g2.setNombre("Queensryche");
		g2.setEstilo("Progressive Metal");
		g2.setMiembros(5);
		
		a2 = new Actuacion();
		a2.setHora("19:00");
		a2.setEscenario("Escenario 2");

		/* TODO:
		 * A�adir g1 y g2 en el festival f1
		 * Enlazar g1 con a1 y g2 con a2
		 */
		
		//Grupos a�adidos al festival
		f1.addGrupo(g1);
		f1.addGrupo(g2);
		
		g1.setActuacion(a1);
		g2.setActuacion(a2);
		
		session.save(f1);
		
		session.getTransaction().commit();		

	}

}
