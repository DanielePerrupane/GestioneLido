//package it.rf.somma;
//
//package it.rf.somma;
//
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Persona[] elenco = new Persona[5];
//		Persona p = new Persona();
//		String scelta = "400";
//		Scanner s = new Scanner(System.in);
//		int i;
//		int j;
//		boolean inserito = false;
//		boolean cfUnico = false;
//		int pos = 0;
//		
//		
//
//		i = 0;
//		while (!scelta.equals("0")) {
//			System.out.println("\n1 - INSERIMENTO\n2 - RICERCA\n3 - MODIFICA\n4 - STAMPA\n0 - ESCI");
//			System.out.println("cosa vuoi fare ?");
//			scelta = s.next();
//
//			switch (scelta) {
//
//			case "1":
//
//				p = new Persona();
//				System.out.println("inserisci il nome");
//				p.nome = s.next();
//				System.out.println("inserisci il cognome");
//				p.cognome = s.next();
//				System.out.println("inserisci il cf");
//				p.cf = s.next();
//
//				inserisci(elenco, p, pos);
//				inserito = true;
//				pos++;
//				break;
//
//			case "2":
//				if (inserito == true) {
//					boolean trovato = false;
//					String cfDaRic;
//					System.out.println("quale cf vuoi cercare?");
//					cfDaRic = s.next();
//					i = 0;
//					while (i < pos) {
//						if (cfDaRic.equals(elenco[i].cf)) {
//							System.out.println(elenco[i].nome + elenco[i].cognome + elenco[i].cf);
//							trovato = true;
//						}
//
//						i++;
//					}
//					if (trovato == false) {
//						System.out.println("elemento non trovato");
//					}
//				} else {
//					System.out.println("effettuare prima un inserimento");
//				}
//				break;
//
//			case "3":
//				if (inserito == true) {
//					int posDaMod;
//					String sceltaMod = "400";
//					System.out.println("quale posizione vuoi modificare?");
//					i = 0;
//					while (i < pos) {
//						System.out.println("posizione: " + i + ", " + elenco[i].nome + ", " + elenco[i].cognome + ", "
//								+ elenco[i].cf);
//						i++;
//					}
//					posDaMod = s.nextInt();
//					if (posDaMod < pos) {
//						while (!sceltaMod.equals("0")) {
//							System.out.println(
//									"Cosa vuoi modificare ?\n1 - NOME\n2 - COGNOME\n3 - CODICE FISCALE\n0 - ESCI");
//							sceltaMod = s.next();
//
//							if (sceltaMod.equals("1")) {
//								System.out.println("inserisci il nuovo nome");
//								elenco[posDaMod].nome = s.next();
//							}
//							if (sceltaMod.equals("2")) {
//								System.out.println("inserisci il nuovo cognome");
//								elenco[posDaMod].cognome = s.next();
//							}
//							if (sceltaMod.equals("3")) {
//								System.out.println("inserisci il nuovo cf");
//								String tmp;
//								tmp = s.next();
//								// INSERIRE CONTROLLO SUL CF
//								cfUnico=false;
//								while (cfUnico == false) {
//									i = 0;
//									cfUnico=true;
//									while (i < pos) {
//
//										if (tmp.equals(elenco[i].cf)) 
//										{
//											cfUnico = false;
//											System.out.println("duplicato qui " + i);
//											System.out.println("inserisci di nuovo il cf");
//											tmp = s.next();
//
//										} 
//										
//										i++;
//									}
//								}
//								
//									elenco[posDaMod].cf=tmp;	
//								
//								
//
//							}
//						}
//					}
//					i = 0;
//					while (i < pos) {
//						System.out.println("posizione: " + i + ", " + elenco[i].nome + ", " + elenco[i].cognome + ", "
//								+ elenco[i].cf);
//						i++;
//					}
//				} else {
//					System.out.println("effettuare prima un inserimento");
//				}
//				break;
//			case "4":
//				if (inserito == true) {
//					i = 0;
//					while (i < pos) {
//						System.out.println("posizione: " + i + ", " + elenco[i].nome + ", " + elenco[i].cognome + ", "
//								+ elenco[i].cf);
//						i++;
//					}
//				} else {
//					System.out.println("effettuare prima un inserimento");
//				}
//				break;
//			}
//		}
//		System.out.println("PROGRAMMA TERMINATO");
//	}
//
//	static void inserisci(Persona vett[], Persona p, int pos) {
//		int i;
//		int j;
//		boolean cfUnico = false;
//		Scanner s = new Scanner(System.in);
//		vett[pos] = new Persona();
//		vett[pos].nome = p.nome;
//		vett[pos].cognome = p.cognome;
//		vett[pos].cf = p.cf;
//
//		while (cfUnico == false) {
//
//			cfUnico = true;
//			i = pos;
//			while (i < vett.length) {
////				System.out.println("i = " + i);
//				j = 0;
//				while (j < pos) {
////					System.out.println("j = " + j);
//					if (vett[pos].cf.equals(vett[j].cf)) {
//
//						System.out.println("inserisci di nuovo il cf");
//						vett[pos].cf = s.next();
//						cfUnico = false;
//
//					}
//					j++;
//				}
//				i++;
//
//			}
//		}
//	}
//}
//
//
//
//
