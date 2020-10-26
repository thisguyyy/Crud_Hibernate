package ejemploHibernate;

import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import controller.VuelosHibernateController;
import models.Vuelos;

public class HibernateDemo {

	public static void main(String[] args) {

		boolean volver = false;

		VuelosHibernateController vuelo = new VuelosHibernateController();

		while (!volver) {

			System.out.println("");
			
			System.out.println("====== BASE DE DATOS ======");
			System.out.println("");
			System.out.println("1- Listar Vuelos");
			System.out.println("2- Mostrar Información de Vuelo");
			System.out.println("3- Insertar Vuelo");
			System.out.println("4- Eliminar Vuelo");
			System.out.println("5- Modificar Vuelo");
			System.out.println("");

			System.out.println("====== FICHEROS ======");
			System.out.println("");
			System.out.println("6- Leer fichero");
			System.out.println("7- Eliminar Valores Fichero");
			System.out.println("8- Buscar Vuelo en Fichero");
			System.out.println("9- Insertar Valores Fichero");
			System.out.println("10- Editar Valores Fichero");
			System.out.println("");

			System.out.println("====== EXPORTAR (BD + Ficheros) ======");
			System.out.println("");
			System.out.println("11- Exportar BD a Fichero");
			System.out.println("12- Exportar de fichero a BD");
			System.out.println("");			

			System.out.println("====== HIBERNATE ======");
			System.out.println("");
			System.out.println("14- Listar Vuelos");
			System.out.println("15- Mostrar Información de Vuelo");
			System.out.println("16- Insertar Vuelo");
			System.out.println("17- Eliminar Vuelo");
			System.out.println("18- Modificar Vuelo");
			System.out.println("");

			System.out.println("13- FINALIZAR EL PROGRAMA");

			System.out.println("Entre el Número de Método a Ejecutar");
			Scanner scan = new Scanner(System.in);
			String next_scan = scan.next();
			int metodo = Integer.parseInt(next_scan);

			seleccionarMetodo(metodo);

		}
	}

	public static void seleccionarMetodo(int metodo) {

		VuelosHibernateController metodos = new VuelosHibernateController();

		switch (metodo) {
			case 14: {
				metodos.print_listarVuelos();
	
				volverMenuPrincipal();
				break;
	
			}
			case 15: {
				
				metodos.print_info_vuelo();
	
				volverMenuPrincipal();
				break;
	
			}
			case 16: {
				
				metodos.pedir_valores_insertar_vuelo();
	
				volverMenuPrincipal();
				break;
	
			}
			case 17: {
				
				metodos.pedir_id_eliminarVuelo();
	
				volverMenuPrincipal();
				break;
	
			}
			
			case 18: {
				
				metodos.pedir_valores_editar_vuelo();
	
				volverMenuPrincipal();
				break;
	
			}
		}
	}

	public static void volverMenuPrincipal() {
		System.out.println("Introduce una letra o número para volver al menú principal");
		Scanner scan = new Scanner(System.in);
		String next_scan = scan.next();

	}

}