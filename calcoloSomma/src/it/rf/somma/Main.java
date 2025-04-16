package it.rf.somma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String scelta = "400";
		String cfDaRic;
		Persona[] elenco = new Persona[5];
		Operatore op = new Operatore();
		boolean inserito = false;
		int dim = 0;
		int i;

		while (!scelta.equals("0")) {
			System.out.println("Cosa vuoi fare ?\n1 - inserimento\n2 - ricerca\n3 - modifica\n4 - stampa\n0 - esci");
			scelta = s.next();

			switch (scelta) {
			case "1":

				op.inserisci(elenco, new Persona(), dim);
				dim++;
				inserito = true;
				break;
			case "2":
				if (inserito == true) {
					String sceltaRicerca = "400";
					String nome;
					String cognome;
					String cf;
					while (!sceltaRicerca.equals("0")) {

						System.out.println("che tipo di ricerca vuoi effettuare?\n1 - nome e cognome\n2 - cf\n0 - esci");
						sceltaRicerca = s.next();

						switch (sceltaRicerca) {
						case "1":
							System.out.println("inserisci nome");
							nome = s.next();
							System.out.println("inserisci cognome");
							cognome = s.next();

							op.ricerca(elenco, dim, nome, cognome);
							break;
						case "2":
							System.out.println("inserisci il cf da cercare");
							cf = s.next();

							op.ricerca(elenco, dim, cf);
							break;

						}
					}
				} else {
					System.out.println("effettuare prima un inserimento");
				}

				break;
			case "3":

				int posDaMod;
				String sceltaMod = "400";
				String tmp;
				boolean cfUnico = false;
				if (inserito == true) {
					i = 0;
					while (i < dim) {
						System.out.println("posizione: " + i + ", nome: " + elenco[i].getNome() + ", cognome: "
								+ elenco[i].getCognome() + ", codice fiscale: " + elenco[i].getCf());
						i++;
					}
					System.out.println("quale posizione vuoi modificare ?");
					posDaMod = s.nextInt();
					System.out.println("cosa vuoi modificare?\n1 - nome\n2 - cognome\n3 - codice fiscale\n0 - esci");
					sceltaMod = s.next();

					op.modifica(elenco, dim, posDaMod, sceltaMod);


				} else {
					System.out.println("effettuare prima un inserimento");
				}

				break;
			case "4":

				if (inserito == true) {
					
					op.stampa(elenco, dim);
					
				} else {
					System.out.println("effettuare prima un inserimento");
				}

				break;
			}
		}
		System.out.println("PROGRAMMA TERMINATO");
	}

	
}
