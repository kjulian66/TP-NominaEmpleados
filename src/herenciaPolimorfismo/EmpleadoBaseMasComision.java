package herenciaPolimorfismo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	
	private Double salarioBase;

	public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial,
			Double ventasBrutas, Double tarifaDeComision, Double salarioBase) {
		super(primerNombre, apellidoPaterno, numeroDeSeguroSocial, ventasBrutas, tarifaDeComision);
		this.salarioBase = salarioBase;
	}

	public Double obtenerSalarioBase() {
		return salarioBase;
	}

	public void establecerSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
				" Ingreso: " + ingresos() + 
				"\n Ingreso mas complementos: " + ingresosMasComplementos();
	}

	@Override
	public Double ingresos() {
		return (this.obtenerTarifaDeComision() * this.obtenerVentasBrutas()) + this.salarioBase;
	}
	
	public Double ingresosMasComplementos(ComplementosSalariales complementosSalariales) {
		return (this.obtenerTarifaDeComision() * this.obtenerVentasBrutas()) + this.salarioBase;
	}
}
