package es.Studium.tabEjer13;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int tabla1[][] = new int[3][3];
		int tabla2[][] = new int[3][3];
		int tabla3[][] = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		//Llamamos al Metodo para introduccir datos a la matriz
		introducirDatos1(tabla1, teclado);
		introducirDatos2(tabla2, teclado);
		//Llamamos al metodo para sumar la matriz
		sumarMatriz(tabla1, tabla2, tabla3);
		//Llamamos al metodo para imprimir la matriz 3
		imprimirMatrizTranspuesta(tabla3);
		teclado.close();
	}
	
	// Metodo para Imprimir la matriz Transpuesta
		private static void imprimirMatrizTranspuesta(int[][] tabla3) {
			int i, e;
			//ponemos un for para recorrer la fila del array
			for(i=0;i<3;i++)
			{
				//Ponemos un segundo for para recorrer la columna del array
				for(e=0;e<3;e++)
				{
					System.out.print(tabla3 [i][e]+" ");
				}
				//Despues de escribir las 3 columnas de cada linea imprimira sun salto de linea
				System.out.println();
			}
		}
	//metodo para sumar las 2 matrices en otra
	private static void sumarMatriz(int[][] tabla1, int[][] tabla2, int[][] tabla3) {
		int i, e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Asignamos los valores de la tabla [i][j] a la tabla[j][i]
				tabla3 [i][e] = tabla1 [i][e] + tabla2 [i][e];
			}
		}
	}
	
	// Metodo para introducir los Datos de la matriz por el teclado
	private static void introducirDatos1(int[][] tabla1, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir de la tabla 1 el valor " + i + " , " + e + " : ");
				tabla1 [i][e] = teclado.nextInt();
			}
		}
	}
	private static void introducirDatos2(int[][] tabla2, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir de la tabla 2 el valor " + i + " , " + e + " : ");
				tabla2 [i][e] = teclado.nextInt();
			}
		}
	}
}
