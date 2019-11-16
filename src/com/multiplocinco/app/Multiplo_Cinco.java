/*
 * Iván Gamaliel Sánchez Zepeda
 * Github: ivangsanchez
 */

package com.multiplocinco.app;

public class Multiplo_Cinco 
{

	public static void main(String[] args) 
	{
		int suma=0;
		
		for(int i=1;i<=500;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
				suma++;
			}
		}
		System.out.println("La cantidad de multiplos de 5 son: "+suma);

	}

}
