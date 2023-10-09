package herenciaPolimorfismo;

public abstract class Empleado {

	private String primerNombre;
	private String apellidoPaterno;
	private String numeroDeSeguroSocial;
	protected ComplementosSalariales complementosSalariales;
	
	public Empleado(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.numeroDeSeguroSocial = numeroDeSeguroSocial;
		this.complementosSalariales  = new ComplementosSalariales(primerNombre);
	}

	public String obtenerPrimerNombre() {
		return primerNombre;
	}

	public void establecerPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String obtenerApellidoPaterno() {
		return apellidoPaterno;
	}

	public void establecerApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String obtenerNumeroDeSeguroSocial() {
		return numeroDeSeguroSocial;
	}

	public void establecerNumeroDeSeguroSocial(String numeroDeSeguroSocial) {
		this.numeroDeSeguroSocial = numeroDeSeguroSocial;
	}
	
	@Override
	public String toString() {
		return "Empleado Nombre: " + primerNombre + 
				"\n Apellido: " + apellidoPaterno + 
				"\n Numero de seguridad social: " + numeroDeSeguroSocial + "\n" +
				complementosSalariales.toString();
	}
	
	public abstract Double ingresos ();
	
	public abstract Double ingresosMasComplementos();
	
}
