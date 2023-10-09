package herenciaPolimorfismo;

public class EmpleadoAsalariado extends Empleado {

	private Double salarioSemanal;

	public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial,
			Double salarioSemanal) {
		super(primerNombre, apellidoPaterno, numeroDeSeguroSocial);
		this.salarioSemanal = salarioSemanal;
	}

	public Double obtenerSalarioSemanal() {
		return salarioSemanal;
	}

	public void establecerSalarioSemanal(Double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
				" Ingreso: " + ingresos() + 
				"\n Ingreso mas complementos: " + ingresosMasComplementos();
	}

	@Override
	public Double ingresos() {
		return salarioSemanal;
	}
	
	@Override
	public Double ingresosMasComplementos() {
		return ingresos() + (ingresos() + complementosSalariales.conteoComplementos());
	}
}
