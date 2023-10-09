package herenciaPolimorfismo;

public class EmpleadoPorComision extends Empleado {

	private Double ventasBrutas;
	private Double tarifaDeComision;
	
	public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial,
			Double ventasBrutas, Double tarifaDeComision) {
		super(primerNombre, apellidoPaterno, numeroDeSeguroSocial);
		this.ventasBrutas = ventasBrutas;
		this.tarifaDeComision = tarifaDeComision;
	}

	public Double obtenerVentasBrutas() {
		return ventasBrutas;
	}

	public void establecerVentasBrutas(Double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public Double obtenerTarifaDeComision() {
		return tarifaDeComision;
	}

	public void establecerTarifaDeComision(Double tarifaDeComision) {
		this.tarifaDeComision = tarifaDeComision;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + 
				" Ingreso: " + ingresos() + 
				"\n Ingreso mas complementos: " + ingresosMasComplementos();
	}

	@Override
	public Double ingresos() {
		return this.tarifaDeComision * this.ventasBrutas;
	}

	@Override
	public Double ingresosMasComplementos() {
		return ingresos() + (ingresos() + complementosSalariales.conteoComplementos());
	}
	
	
	
}
