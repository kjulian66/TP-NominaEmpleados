package herenciaPolimorfismo;

import java.util.Random;

public class ComplementosSalariales {
	
	private final static Random RANDOM = new Random(); // Para establecer complementos salariales de forma aleatoria al instanciar un objeto complementosSalariales
	
	private Boolean PA = RANDOM.nextBoolean(); // Plus de antigüedad
	private Boolean CA = RANDOM.nextBoolean(); // COMPLEMENTO ACADEMICO Complemento de idiomas, título o conocimientos especiales
	private Boolean CP = RANDOM.nextBoolean(); // Complemento por productividad
	private Boolean PN = RANDOM.nextBoolean(); // Plus de nocturnidad
	private Boolean PP = RANDOM.nextBoolean(); // PLUS PELIGROSIDAD Plus de toxicidad, peligrosidad o semejantes
	private Boolean CF = RANDOM.nextBoolean(); // Complemento por trabajar días festivos
	private Boolean PF = RANDOM.nextBoolean(); // PLUS FUNCION Plus por función desempeñada
	private Boolean CDH = RANDOM.nextBoolean(); // Complemento por disponibilidad horaria
	private Boolean GB = RANDOM.nextBoolean(); // Gratificación por beneficios
	private Boolean AA = RANDOM.nextBoolean(); // Acceso a las acciones de la empresa

	private String nombre;
	private String descripcion;
	
	public ComplementosSalariales(String nombre) {
		this.nombre = nombre;
		this.descripcion = "Complementos salariales de " + nombre;
	}

	public Boolean obtenerPA() {
		return PA;
	}

	public void establecerPA(Boolean pA) {
		PA = pA;
	}

	public Boolean obtenerCA() {
		return CA;
	}

	public void establecerCA(Boolean cA) {
		CA = cA;
	}

	public Boolean obtenerCP() {
		return CP;
	}

	public void establecerCP(Boolean cP) {
		CP = cP;
	}

	public Boolean obtenerPN() {
		return PN;
	}

	public void establecerPN(Boolean pN) {
		PN = pN;
	}

	public Boolean obtenerPP() {
		return PP;
	}

	public void establecerPP(Boolean pP) {
		PP = pP;
	}

	public Boolean obtenerCF() {
		return CF;
	}

	public void establecerCF(Boolean cF) {
		CF = cF;
	}

	public Boolean obtenerPF() {
		return PF;
	}

	public void establecerPF(Boolean pF) {
		PF = pF;
	}

	public Boolean obtenerCDH() {
		return CDH;
	}

	public void establecerCDH(Boolean cDH) {
		CDH = cDH;
	}

	public Boolean obtenerGB() {
		return GB;
	}

	public void establecerGB(Boolean gB) {
		GB = gB;
	}

	public Boolean obtenerAA() {
		return AA;
	}

	public void establecerAA(Boolean aA) {
		AA = aA;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerDescripcion() {
		return descripcion;
	}

	public void establecerDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double conteoComplementos() {
		Double conteo = 0.0;
		if (PA) {
			conteo = conteo + 0.7; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (CA) {
			conteo = conteo + 0.7; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (CP) {
			conteo = conteo + 0.5; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (PN) {
			conteo = conteo + 0.2; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (PP) {
			conteo = conteo + 0.3; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (CF) {
			conteo = conteo + 0.4; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (PF) {
			conteo = conteo + 0.4; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (CDH) {
			conteo = conteo + 0.2; // Devuelve Double en porcentaje en caso de ser true
		}
		
		if (GB) {
			conteo = conteo + 0.1; // Devuelve Double en porcentaje en caso de ser true
		}
		
		return conteo; // Retorna la sumatoria de todos los complementos como un Double para usarlo como porcentaje
	}
	
	@Override
	public String toString() {
		return this.descripcion + ": " +
				"\n Plus antiguedad: " + PA + 
				"\n Complemento academico: " + CA + 
				"\n Complemento productividad: " + CP + 
				"\n Plus nocturnidad: " + PN + 
				"\n Plus peligrosidad: " + PP + 
				"\n Complemento festivos: " + CF + 
				"\n Plus funcion: " + PF + 
				"\n Complemento disponibilidad horaria: " + CDH + 
				"\n Gratificacion por beneficios: " + GB + 
				"\n Acceso a acciones: " + AA;
	}
	

	
}
