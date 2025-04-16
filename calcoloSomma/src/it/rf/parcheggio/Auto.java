package it.rf.parcheggio;

public class Auto extends Veicolo  {

//	private Veicolo v;
	private Integer numPorte;
	private boolean tettuccio;
	private Integer numPosti;
	private Integer velocita = 0;
	
	public Auto() {}
	
	public Auto(Integer numPorte, boolean tettuccio, Integer numPosti, Integer velocita) {
		super();
		this.numPorte=numPorte;
		this.tettuccio=tettuccio;
		this.numPosti=numPosti;
		this.velocita=velocita;
	}
	
	public Integer getNumPorte()
	{
		return this.numPorte;
	}
	public void setNumPorte(Integer numPorte)
	{
		this.numPorte=numPorte;
	}
	
	public boolean getTettuccio()
	{
		return this.tettuccio;
	}
	public void setTettuccio(boolean tettuccio)
	{
		this.tettuccio=tettuccio;
	}
	
	public Integer getNumPosti()
	{
		return this.numPosti;
	}
	public void setNumPosti(Integer numPosti)
	{
		this.numPosti=numPosti;
	}
	
	
	
	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public String toString()
	{
		
		return "targa: "+this.getTarga() 
		+ " cilindrata: "+this.getCilindrata()
		+ " colore: "+this.getColore()
		+ " numTelaio: "+this.getNumTelaio()
		+ " num porte: "+this.getNumPorte()
		+ " num posti: "+this.getNumPosti()
		+ " tettuccio: "+this.getTettuccio()
		+ " velocita: "+this.getVelocita()+"km/h";
		
		
	}

	@Override
	public int accelera() {
		// TODO Auto-generated method stub
		
		this.velocita = this.velocita + 50;
		
		return this.velocita;
	}
	@Override
	public int decelera()
	{
		this.velocita=this.velocita - 50;
		return this.velocita;
	}
	
}
