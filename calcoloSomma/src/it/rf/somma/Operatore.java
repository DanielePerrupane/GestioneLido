package it.rf.somma;

import java.util.Scanner;

public class Operatore {
	
	
	public void ricerca(Persona[] vettore,int dim, String nome, String cognome)
	{
		int i;
		int contatore=0;
		i=0;
		while(i<dim)
		{
			if(nome.equals(vettore[i].getNome()) && cognome.equals(vettore[i].getCognome()))
			{
				System.out.println("persona trovata nella posizione "+i);
				System.out.println(vettore[i].getNome() + ", " + vettore[i].getCognome() + ", " + vettore[i].getCf());
				contatore++;
			}
			i++;
		}
		if(contatore==0)
		{
			System.out.println("nessuna corrispondenza");
		}
	}
	
	public void ricerca(Persona [] vettore,int dim, String cf)
	{
		int i; 
		int contatore = 0;
		i=0;
		while(i<dim)
		{
			if(cf.equals(vettore[i].getCf()))
			{
				System.out.println("persona trovata nella posizione "+i);
				System.out.println(vettore[i].getNome() + ", " + vettore[i].getCognome() + ", " + vettore[i].getCf());
				contatore++;
			}
			i++;
		}
		if(contatore==0)
		{
			System.out.println("nessuna corrispondenza");
		}
	}

	public void stampa(Persona [] vettore, int dim)
	{
		int i;
		i=0;
		while(i<dim)
		{
			System.out.println("posizione: " + i);
			System.out.println("nome: " + vettore[i].getNome());
			System.out.println("cognome: " + vettore[i].getCognome());
			System.out.println("cf: " + vettore[i].getCf()+"\n");
			;
			i++;
		}
	}

	public void modifica(Persona [] vettore, int dim, int pos,String scelta)

	{
		Scanner s = new Scanner(System.in);
		switch(scelta)
		{
		case "1":
				System.out.println("inserisci il nome");
				vettore[pos].setNome(s.next());
			break;
		case "2":
				System.out.println("inserisci il cognome");
				vettore[pos].setCognome(s.next());
			break;
		case "3":
				System.out.println("inserisci il cf");
				vettore[pos].setCf(s.next());
			break;
		}
	}

	public void inserisci(Persona[] vettore, Persona persona, int posizione) {
		int i;
		boolean cfUnico = false;
		Scanner s = new Scanner(System.in);
		vettore[posizione] = persona;
		System.out.println("inserisci il nome");
		vettore[posizione].setNome(s.next());
		System.out.println("inserisci il cognome");
		vettore[posizione].setCognome(s.next());
		System.out.println("inserisci il cf");
		vettore[posizione].setCf(s.next());

		while (cfUnico == false) {
			cfUnico = true;
			i = 0;
			while (i < posizione) {
				if (vettore[posizione].getCf().equals(vettore[i].getCf())) {
					cfUnico = false;
					System.out.println("codice fiscale duplicato inserirlo nuovamente");
					vettore[posizione].setCf(s.next());
				}

				i++;
			}
		}

	}
	
	
//	System.out.println("inserisci il nuovo codice fiscale");
//	tmp = s.next();
//	cfUnico = false;
//	while (cfUnico == false) {
//		cfUnico = true;
//		i = 0;
//		while (i < dim) {
//			if (tmp.equals(elenco[i].getCf())) {
//				cfUnico = false;
//				System.out.println("codice fiscale già presente inserirlo nuovamente");
//				tmp = s.next();
//			}
//			i++;
//		}
//	}
//	elenco[posDaMod].setCf(tmp);
}
