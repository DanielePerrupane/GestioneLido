package it.rf.parcheggio;

import java.util.ArrayList;

import java.util.Scanner;

public class Gestione implements Funzioni{
	
	
	
/*	 
  
 	Parco veicoli con ArrayList utilizzando un'interfaccia e sfruttando l'ereditarietà per estensione, 
	creando un'arrayList che accetta sia auto che camion.

	Scrivere un software che gestisce un parco di veicoli (auto e camion).
	Il software consente inserimento, ricerca, modifica e cancellazione per tutti i veicoli.
	Ogni veicolo ha dei tempi di accelerazione:
		
		- i camion accelerano a +10km/h
		- le macchine a +50km/h
		
	Il menù consente di accelerare e memorizzare la velocità (nell'oggetto).
	Le accelerate sono obbligate dall'interfaccia.

 */
	
	ArrayList <Veicolo> listaVeicoli = new ArrayList<Veicolo>();
//	Veicolo [] elenco = new Veicolo [50];
	Scanner s = new Scanner(System.in);
	int contatore=0;
	String bool;
	
		
	
	
	@Override
	public void registra(Veicolo v)
	{
//		elenco[contatore] = v;
		boolean targaUnica = false;
		int i;
		int j;
		
		listaVeicoli.add(v);
		if(listaVeicoli.getLast() instanceof Auto)
		{
			System.out.println("1");
//			Auto a = (Auto)elenco[contatore];
			Auto a = (Auto)listaVeicoli.getLast();
			
			System.out.println("inserisci targa");
			a.setTarga(s.next());
			
			//INSERIRE CONTROLLO SULLA TARGA
			while(targaUnica==false)
			{
				targaUnica =true;
				
				i=0;
				while(i<listaVeicoli.size())
				{
					j=0;
					while(j<i)
					{
						System.out.println("size: "+listaVeicoli.size());
						System.out.println("i: "+j);
						if(listaVeicoli.get(j).getTarga().equals(listaVeicoli.getLast().getTarga()))
						{
							targaUnica = false;
							System.out.println("targa già presente, inserirla di nuovo");
							a.setTarga(s.next());
						}
						j++;
					}
					
					
					i++;
				}
				
			}
			
			System.out.println("inserisci colore");
			a.setColore(s.next());
			
			System.out.println("inserisci n telaio");
			a.setNumTelaio(s.next());
			
			System.out.println("inserisci cilindrata (int)");
			a.setCilindrata(s.nextInt());
			
			System.out.println("inserisci num porte (int)");
			a.setNumPorte(s.nextInt());
			
			System.out.println("tettuccio 'si' o 'no'");
			bool=s.next();
			if(bool.equals("si"))
			{
				a.setTettuccio(true);
				
			}
			else
			{
				a.setTettuccio(false);
				
			}
			System.out.println("inserisci num posti (int)");
			a.setNumPosti(s.nextInt());
			
			
			
		}
		if(listaVeicoli.getLast() instanceof Camion)
		{
			System.out.println("2");
//			Camion c = (Camion)elenco[contatore];
			Camion c = (Camion)listaVeicoli.getLast();
			
			System.out.println("inserisci targa");
			c.setTarga(s.next());
			//INSERIRE CONTROLLO SULLA TARGA
			while(targaUnica==false)
			{
				targaUnica =true;
				
				i=0;
				while(i<listaVeicoli.size())
				{
					j=0;
					while(j<i)
					{
						System.out.println("size: "+listaVeicoli.size());
						System.out.println("i: "+j);
						if(listaVeicoli.get(j).getTarga().equals(listaVeicoli.getLast().getTarga()))
						{
							targaUnica = false;
							System.out.println("targa già presente, inserirla di nuovo");
							c.setTarga(s.next());
						}
						j++;
					}
					
					
					i++;
				}
				
			}
			System.out.println("inserisci colore");
			c.setColore(s.next());
			System.out.println("inserisci n telaio");
			c.setNumTelaio(s.next());
			System.out.println("inserisci cilindrata (int)");
			c.setCilindrata(s.nextInt());
			System.out.println("presenza rimorchio 'si' o 'no'");
			bool=s.next();
			if(bool.equals("si"))
			{
				c.setPresenzaRimorchio(true);
			}
			else
			{
				c.setPresenzaRimorchio(false);
			}
			System.out.println("quante ruote motrici (int)");
			c.setNumeroRuoteMotrici(s.nextInt());
			System.out.println(listaVeicoli.getLast().toString());
			
			
		}
		
	}
	

	@Override
	public void stampa()
	{
		int i;
		if(listaVeicoli.size()>0)
		{
			for(i=0;i<listaVeicoli.size();i++)
			{
				
				System.out.println(listaVeicoli.get(i).toString());
			}
		}
		else
		{
			System.out.println("parco auto vuoto");
		}
		
	}
	
	@Override
	public void ricercaNumPorte()
	{
		boolean trovato = false;
		int numPorte = 0;
		System.out.println("quante porte vuoi?");
		numPorte = s.nextInt();
		
		for(Veicolo v : listaVeicoli)
		{
			if(v instanceof Auto && ((Auto) v).getNumPorte()==numPorte)
			{
				trovato=true;
				System.out.println(v.toString());
			}
		}
		if(trovato==false)
		{
			System.out.println("nessuna corrispondenza");
		}
	}
	
	@Override 
	public void ricercaRuoteMotrici()
	{
		
		boolean trovato = false;
		int ruoteMot = 0;
		System.out.println("quante ruote motrici vuoi?");
		ruoteMot = s.nextInt();
		
		for(Veicolo v : listaVeicoli)
		{
			if(v instanceof Camion && ((Camion) v).getNumeroRuoteMotrici()==ruoteMot)
			{
				trovato=true;
				System.out.println(v.toString());
			}
			
		}
		if(trovato==false)
		{
			System.out.println("nessuno corrispondenza");
		}
	}
	
	@Override
	public Integer ricerca()
	{
		int i;
		String targa; 
		boolean trovato=false;
		System.out.println("inserisci la targa da cercare");
		targa = s.next();
		
		for(i=0;i<listaVeicoli.size();i++)
		{
			if(targa.equals(listaVeicoli.get(i).getTarga()))
			{
				trovato=true;
				System.out.println("posizione: "+i+" "+listaVeicoli.get(i).toString());
				return i;
			}
		}
		if(trovato==false)
		{
			System.out.println("veicolo non trovato");
		}
		
		return 0;
		
		
	}

	@Override
	public void modifica()
	{
		int posDaMod = ricerca();
		if(listaVeicoli.get(posDaMod) instanceof Auto)
		{
			System.out.println("modifica auto");
			Auto a = (Auto)listaVeicoli.get(posDaMod);
			
			System.out.println("inserisci colore");
			a.setColore(s.next());
			
			System.out.println("inserisci cilindrata (int)");
			a.setCilindrata(s.nextInt());
			System.out.println("inserisci num porte (int)");
			a.setNumPorte(s.nextInt());
			System.out.println("tettuccio 'si' o 'no'");
			bool=s.next();
			if(bool.equals("si"))
			{
				a.setTettuccio(true);
			}
			else
			{
				a.setTettuccio(false);
			}
			System.out.println("inserisci num posti (int)");
			a.setNumPosti(s.nextInt());
			
		}
		if(listaVeicoli.get(posDaMod) instanceof Camion)
		{
			System.out.println("modifica camion");
			Camion c = (Camion)listaVeicoli.get(posDaMod);
			
			System.out.println("inserisci colore");
			c.setColore(s.next());
			
			System.out.println("inserisci cilindrata (int)");
			c.setCilindrata(s.nextInt());
			System.out.println("presenza rimorchio 'si' o 'no'");
			bool=s.next();
			if(bool.equals("si"))
			{
				c.setPresenzaRimorchio(true);
			}
			else
			{
				c.setPresenzaRimorchio(false);
			}
			System.out.println("quante ruote motrici (int)");
			c.setNumeroRuoteMotrici(s.nextInt());
			System.out.println(listaVeicoli.get(posDaMod).toString());
		}
		

	}

	

	@Override
	public void acceleraVeicolo()
	{
		int i;
		String targa; 
		boolean trovato=false;
		System.out.println("inserisci la targa da cercare");
		targa = s.next();
		
		for(i=0;i<listaVeicoli.size();i++)
		{
			if(targa.equals(listaVeicoli.get(i).getTarga()))
			{
				trovato=true;
				if(listaVeicoli.get(i) instanceof Auto)
				{
					
					listaVeicoli.get(i).accelera();
					System.out.println("TARGA: "+listaVeicoli.get(i).getTarga()+"\nVELOCITA': "+listaVeicoli.get(i).getVelocita()+"km/h");
					
				}
				if(listaVeicoli.get(i) instanceof Camion)
				{
					
					listaVeicoli.get(i).accelera();
					System.out.println("TARGA: "+listaVeicoli.get(i).getTarga()+"\nVELOCITA': "+listaVeicoli.get(i).getVelocita()+"km/h");
					
				}
				
				
				
			}
		}
		if(trovato==false)
		{
			System.out.println("veicolo non trovato");
		}
		
		
		
		
		
		
	}
	
	@Override
	public void deceleraVeicolo()
	{
		int i;
		String targa; 
		boolean trovato=false;
		System.out.println("inserisci la targa da cercare");
		targa = s.next();
		
		for(i=0;i<listaVeicoli.size();i++)
		{
			if(targa.equals(listaVeicoli.get(i).getTarga()))
			{
				trovato=true;
				if(listaVeicoli.get(i) instanceof Auto)
				{
					
					listaVeicoli.get(i).decelera();
					System.out.println("TARGA: "+listaVeicoli.get(i).getTarga()+"\nVELOCITA': "+listaVeicoli.get(i).getVelocita()+"km/h");
					
				}
				if(listaVeicoli.get(i) instanceof Camion)
				{
					
					listaVeicoli.get(i).decelera();
					System.out.println("TARGA: "+listaVeicoli.get(i).getTarga()+"\nVELOCITA': "+listaVeicoli.get(i).getVelocita()+"km/h");
					
				}
			}
		}
		if(trovato==false)
		{
			System.out.println("veicolo non trovato");
		}
		
	}

	@Override
	public void cancella()
	{
		
		
		int i;
		String targa; 
		boolean trovato=false;
		String elimina = "400";
		System.out.println("inserisci la targa del veicolo che vuoi eliminare");
		targa = s.next();
		
		for(i=0;i<listaVeicoli.size();i++)
		{
			if(targa.equals(listaVeicoli.get(i).getTarga()))
			{
				trovato=true;
				System.out.println("posizione: "+i+" "+listaVeicoli.get(i).toString());
				System.out.println("'1' ELIMINA \n'qualsiasi altro tasto' ANNULLA ");
				elimina = s.next();
				if(elimina.equals("1"))
				{
					listaVeicoli.remove(i);
					
				}
				else
				{
					break;
				}
			}
		}
		if(trovato==false)
		{
			System.out.println("veicolo non trovato");
		}
		
		
	}


}
