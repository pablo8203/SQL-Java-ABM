package conexion.sql;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP8 {

	public static void main(String[] args) {
	     Scanner compras = new Scanner(System.in);

	        String[] NombreProds = new String[3];
	        int[] CantProd = new int[3];
	        double[] ProdPrecio = new double[3];

	        for (int i = 0; i < NombreProds.length; i++) {
	            System.out.println("Por favor, ingrese un producto a su carrito");
	            System.out.println("Maximo 3 productos por descuento");
	            System.out.println(".............................................");

	            String nombreProducto = null;
	            while (true) {
	                try {
	                    System.out.println("Ingrese el nombre del producto: ");
	                    nombreProducto = compras.next();
	                    Integer.parseInt(nombreProducto); 
	                    System.out.println("Ha ingresado un valor no válido. Por favor ingrese un texto.");
	                } catch (NumberFormatException e) {
	                    
	                    break;
	                }
	            }

	            NombreProds[i] = nombreProducto;
	            
	             
	            while (true) {
	                try {
	                    System.out.println("Ingrese la cantidad a llevar del producto");
	                    CantProd[i] = compras.nextInt();
	                    if (CantProd[i] <= 0) {
	                        throw new IllegalArgumentException("La cantidad debe ser un número positivo.");
	                    }
	                    break;
	                } catch (InputMismatchException e) {
	                    System.out.println("Ha ingresado un valor no válido. Por favor ingrese un número.");
	                    compras.nextLine();
	                } catch (IllegalArgumentException e) {
	                    System.out.println(e.getMessage());
	                    compras.nextLine(); 
	                }
	            }

	            while (true) {
	                try {
	                    System.out.println("Ingrese el precio del producto");
	                    ProdPrecio[i] = compras.nextDouble();
	                    if (ProdPrecio[i] <= 0) {
	                        throw new IllegalArgumentException("El precio debe ser un número positivo.");
	                    }
	                    break;
	                } catch (InputMismatchException e) {
	                    System.out.println("Ha ingresado un valor no válido. Por favor ingrese un número.");
	                    compras.nextLine();
	                } catch (IllegalArgumentException e) {
	                    System.out.println(e.getMessage());
	                    compras.nextLine(); 
	                }
	            }
	        }

	        System.out.println("Cantidad\tPrecio\tNombre del Producto");

	        for (int i = 0; i < NombreProds.length; i++) {
	            System.out.printf("%d\t\t%.2f\t%s\n", CantProd[i], ProdPrecio[i], NombreProds[i]);
	        }
	    }
	}