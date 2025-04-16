package it.rf.parcheggio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Gestione g = new Gestione();
		boolean inserito = false;
		String seleziona="400";
		String scelta = "400";
		int velAuto = 0;
		int velCamion = 0;
		
		while(!scelta.equals("0"))
		{
			
			
			System.out.println("cosa vuoi fare?\n1 - REGISTRA VEICOLO\n2 - RICERCA VEICOLO\n3 - MODIFICA VEICOLO\n4 - CONTROLLA PARCHEGGIO\n5 - ACCELERA\n6 - DECELERA\n7 - CANCELLA\n0 - ESCI");
			scelta = s.next();
			
			
			switch(scelta)
			{
			
			case "1":
				System.out.println("seleziona il tipo di veicolo\n1 - AUTO\n2 - CAMION");
				seleziona=s.next();
				if(seleziona.equals("1"))
				{
					g.registra(new Auto());
					inserito=true;
				}
				if(seleziona.equals("2"))
				{
					System.out.println("2");
					g.registra(new Camion());
					inserito=true;
				}
				

				break;
			case "2":
				
				
				if(inserito==true)
				{
					String sceltaRic = "400";
					System.out.println("1 - RICERCA TARGA\n2 - RICERCA RUOTE MOTRICI\n3 - RICERCA NUM PORTE\n0 - ESCI");
					sceltaRic = s.next();
					
					switch(sceltaRic)
					{
					case "1":
						g.ricerca();
						break;
					case "2":
						g.ricercaRuoteMotrici();
						break;
					case "3":
						g.ricercaNumPorte();
						break;
					case "0":
						break;
					
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
					g.modifica();
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				
				break;
			case "4":
				
				if(inserito==true)
				{
					g.stampa();
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			case "5":
				if(inserito==true)
				{
					
					g.acceleraVeicolo();
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			case "6":
				if(inserito==true)
				{
					
					g.deceleraVeicolo();
				}
				else
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			case "7":
				if(inserito==true)
				{
					g.cancella();
				}
				else 
				{
					System.out.println("effettuare prima un inserimento");
				}
				break;
			}
		}
		System.out.println("PROGRAMMA TERMINATO");
		
		
		
		
		
		
		
	}

}
