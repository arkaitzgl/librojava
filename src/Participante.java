
public class Participante {

	//Atributos privados para no ser accesibles desde fuera de la clase
	private String nombre;
	private String usuarioGit;
	private String email;
	boolean trabajador;
	
	

	//Constructores
	
	public Participante() {
		super();
		this.nombre = "";
		this.usuarioGit = "";
		this.email= "";
		this.trabajador= false;
	}

	
	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email= "";
		this.trabajador= false;
	}
	
	
	//Getters y setters son necesarios para mantener la encapsulacion
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUsuarioGit() {
		return usuarioGit;
	}


	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	
	
	public boolean isTrabajador() {
		return trabajador;
	}


	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

	
	//Otros metodos
	
	String getLinkGitHub () {
		
		return "https://github.com/" + this.usuarioGit;
	}


	public String toString() {
		return "Participante [nombre=" + this.nombre + ", usuarioGit=" + this.usuarioGit + ", email=" + this.email + ", trabajador="
				+ this.trabajador + "]";
	}
	
	
	
}
