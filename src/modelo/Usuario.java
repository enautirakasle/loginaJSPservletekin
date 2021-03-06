package modelo;

public class Usuario {
	//atributos
		private int id;
		private String nombre;
		private String apellido;
		private int edad;
		private String dni;
//		private Date fechaNacimiento;
		private String password;
		private String rol;
		
		public static final  String USUARIO = "usuario";
		public static final String ADMIN = "admin";

		//private ArrayList<Prestamo> prestamos;
		
		//metodos
		
		public boolean esAdmin(){
			return this.rol.equals(ADMIN);
		}
		public boolean esUsuario(){
			return this.rol.equals(USUARIO);
		}
//		public ArrayList<Prestamo> getPrestamos() {
//			return prestamos;
//		}
//		public void setPrestamos(ArrayList<Prestamo> prestamos) {
//			this.prestamos = prestamos;
//		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
//		public Date getFechaNacimiento() {
//			return fechaNacimiento;
//		}
//		public void setFechaNacimiento(Date fechaNacimiento) {
//			this.fechaNacimiento = fechaNacimiento;
//		}
		//getters and setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRol() {
			return rol;
		}
		public void setRol(String rol) {
			this.rol = rol;
		}
}
