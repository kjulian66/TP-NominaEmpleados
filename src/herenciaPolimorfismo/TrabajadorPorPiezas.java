package herenciaPolimorfismo;

public class TrabajadorPorPiezas extends Empleado {

	private Double sueldo;
	private Integer piezas;

	public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroDeSeguroSocial, Double sueldo,
			Integer piezas) {
		super(primerNombre, apellidoPaterno, numeroDeSeguroSocial);
		this.sueldo = sueldo;
		this.piezas = piezas;
	}

	public Double obtenerSueldo() {
		return sueldo;
	}


	public void establecerSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


	public Integer obtenerPiezas() {
		return piezas;
	}


	public void establecerPiezas(Integer piezas) {
		this.piezas = piezas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
				" Ingreso: " + ingresos() + 
				"\n Ingreso mas complementos: " + ingresosMasComplementos();
	}

	@Override
	public Double ingresos() {
		return this.sueldo +  this.piezas;
	}
	
	@Override
	public Double ingresosMasComplementos() {
		return ingresos() + (ingresos() + complementosSalariales.conteoComplementos());
	}

}
