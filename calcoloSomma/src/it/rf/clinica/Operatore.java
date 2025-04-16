package it.rf.clinica;

import java.util.Date;
import java.util.Scanner;

public class Operatore extends Persona{
	
	Scanner s = new Scanner(System.in);
	
	public void inserisci(Paziente [] vettore,int posizione)
	{
		int i;
		int j;
		boolean cfUnico = false;
		
		vettore[posizione]=new Paziente();
		System.out.println("inserisci data ricovero");
		vettore[posizione].setDataRicovero(s.next());
		System.out.println("inserisci nome");
		vettore[posizione].setNome(s.next());
		System.out.println("inserisci cognome");
		vettore[posizione].setCognome(s.next());
		
			
			System.out.println("inserisci cf");
			vettore[posizione].setCf(s.next());
			while(cfUnico == false)
			{
				cfUnico=true;
				j=0;
				while(j<posizione)
				{
					if(vettore[posizione].getCf().equals(vettore[j].getCf()))
					{
						cfUnico = false;
						System.out.println("codice fiscale già presente, inserirlo nuovamente");
						vettore[posizione].setCf(s.next());
					}
					j++;
				}
			}
		
	}
	public void stampa(Paziente [] vettore,int dimensione)
	{
		int i;
		for(i=0;i<dimensione;i++)
		{
			System.out.println("posizione: "+i+
					" data ricovero: "+vettore[i].getDataInternamento()+
					" nome: "+vettore[i].getNome()+
					" cognome: "+vettore[i].getCognome()+
					" cf: "+vettore[i].getCf());
			
		}
	}
	public void ricerca(Paziente [] vettore, int dimensione, String nome, String cognome)
	{
		int i;
		boolean nonTrovato=true;
		for(i=0;i<dimensione;i++)
		{
			if(nome.equals(vettore[i].getNome()) && cognome.equals(vettore[i].getCognome()))
			{
				nonTrovato=false;
				System.out.println("corrispondenza trovata nella posizione: "+i);
				System.out.println("nome:"+vettore[i].getNome()+
									"\ncognome: "+vettore[i].getCognome()+
									"\ncf: "+vettore[i].getCf()+
									"\ndata ricovero: "+vettore[i].getDataInternamento());
			}
		}
		if(nonTrovato == true)
		{
			System.out.println("nessuna corrispondenza");
		}
	}
	public Paziente ricerca(Paziente [] vettore, int dimensione, String cf)
	{
		int i;
		
		
		for(i=0;i<dimensione;i++)
		{
			if(cf.equals(vettore[i].getCf()))
			{
				
				System.out.println("nome:"+vettore[i].getNome()+
						"\ncognome: "+vettore[i].getCognome()+
						"\ncf: "+vettore[i].getCf()+
						"\ndata ricovero: "+vettore[i].getDataInternamento());
				return vettore[i];
			}
		}
		return null;
	}
	public void ricerca(Paziente [] vettore,Date data)
	{
		
	}
	public void modifica(Paziente [] vettore,int dimensione,int posDaModificare)
	{
		String scelta="400";
		while(!scelta.equals("0"))
		{
			System.out.println("COSA VUOI MODIFICARE\n1 - NOME\n2 - COGNOME\n0 - ESCI");
			scelta=s.next();
			
			switch(scelta)
			{
			case "1":
				System.out.println("inserisci il nuovo nome:");
				vettore[posDaModificare].setNome(s.next());
				break;
			case "2":
				System.out.println("inserisci il nuovo cognome");
				vettore[posDaModificare].setCognome(s.next());
				break;
			}
		}
		
		
	}
}

