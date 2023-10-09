package herenciaPolimorfismo;

public class EmpleadoPorHora extends Empleado {

	private Double sueldoPorHoras;
	private Double horasTrabajadas;

	public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial,
			Double sueldoPorHoras, Double horasTrabajadas) {
		super(primerNombre, apellidoPaterno, numeroDeSeguroSocial);
		this.sueldoPorHoras = sueldoPorHoras;
		this.horasTrabajadas = horasTrabajadas;
	}

	public Double obtenerSueldoPorHoras() {
		return sueldoPorHoras;
	}

	public void establecerSueldoPorHoras(Double sueldoPorHoras) {
		this.sueldoPorHoras = sueldoPorHoras;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
				" Ingreso: " + ingresos() + 
				"\n Ingreso mas complementos: " + ingresosMasComplementos();
	}

	@Override
	public Double ingresos() {
		if (this.horasTrabajadas <= 40) {
			return this.sueldoPorHoras * this.horasTrabajadas;
		} else {
			return 40 * this.sueldoPorHoras + (this.horasTrabajadas - 40) * this.sueldoPorHoras * 1.5;
		}
	}
	
	@Override
	public Double ingresosMasComplementos() {
		return ingresos() + (ingresos() + complementosSalariales.conteoComplementos());
	}
	
}
