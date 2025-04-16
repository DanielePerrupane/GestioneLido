package it.rf.clinica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paziente [] elenco = new Paziente[50];
		Operatore op = new Operatore();
		Scanner s = new Scanner(System.in);
		int dimensione=0;
		boolean inserito = false;
		String scelta="400";
		
		while(!scelta.equals("0"))
		{
			System.out.println("COSA VUOI FARE?\n1 - INSERIMENTO\n2 - RICERCA\n3 - MODIFICA\n4 - STAMPA\n0 - ESCI");
			scelta=s.next();
			
			switch(scelta)
			{
			case "1":
				op.inserisci(elenco, dimensione);
				dimensione++;
				inserito = true;
				break;
			case "2":
				if(inserito==true)
				{
					String sceltaRic = "400";
					String nomeDaRic ;
					String cognomeDaRic;
					String cfDaRic;
					
					while(!sceltaRic.equals("0"))
					{
						System.out.println("PER COSA VUOI RICERCARE?\n1 - NOME E COGNOME\n2 - CODICE FISCALE\n0 - ESCI");
						sceltaRic = s.next();
						
						switch(sceltaRic)
						{
						case "1":
							System.out.println("inserire nome da cercare");
							nomeDaRic=s.next();
							System.out.println("inserire cognome da cercare");
							cognomeDaRic=s.next();
							op.ricerca(elenco, dimensione, nomeDaRic, cognomeDaRic);
							break;
						case "2":
							System.out.println("inserisci codice fiscale da cercare");
							cfDaRic=s.next();
							Paziente p = op.ricerca(elenco, dimensione, cfDaRic);
							System.out.println(p);
							break;
						}
					}
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			case "3":
				if(inserito==true)
				{
					int posDaMod=0;
					System.out.println("QUALE POSIZIONE VUOI MODIFICARE?");
					posDaMod=s.nextInt();
					
					op.modifica(elenco, dimensione, posDaMod);
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			case "4":
				if(inserito==true)
				{
					op.stampa(elenco, dimensione);
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			}
		}
	}

}
