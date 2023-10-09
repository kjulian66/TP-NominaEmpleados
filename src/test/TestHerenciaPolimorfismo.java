package test;

import herenciaPolimorfismo.Empleado;
import herenciaPolimorfismo.ComplementosSalariales;
import herenciaPolimorfismo.EmpleadoAsalariado;
import herenciaPolimorfismo.EmpleadoPorComision;
import herenciaPolimorfismo.EmpleadoBaseMasComision;
import herenciaPolimorfismo.EmpleadoPorHora;
import herenciaPolimorfismo.TrabajadorPorPiezas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestHerenciaPolimorfismo {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();

		Empleado EA = new EmpleadoAsalariado("Julian", "Bianchi", "438912042012", 1500.00);
		Empleado EC = new EmpleadoPorComision("Pedro", "Sanchez", "574938012392", 150.00, 10.00);
		Empleado EH = new EmpleadoPorHora("Raul", "Gomez", "438912042012", 50.00, 45.00);
		Empleado EBC = new EmpleadoBaseMasComision("Miriam", "Perez", "574938012392", 150.00, 10.00, 750.00);
		Empleado TP = new TrabajadorPorPiezas("Sofia", "Martinez", "843924839212", 1500.00, 15);

		listaEmpleados.add(EA);
		listaEmpleados.add(EC);
		listaEmpleados.add(EH);
		listaEmpleados.add(EBC);
		listaEmpleados.add(TP);
		
		for (Empleado e : listaEmpleados) {
			System.out.println("-------------------");
			System.out.println(e.toString());
			System.out.println("-------------------");
		}
	}

}
