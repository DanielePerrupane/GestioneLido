package it.rf.parcheggio;

public class Camion extends Veicolo {
	
	private boolean presenzaRimorchio;
	private Integer numeroRuoteMotrici;
	private Integer velocita = 0;
	
	
	public Camion() {}
	
	public Camion(boolean presenzaRimorchio, Integer numeroRuoteMotrici, Integer velocita)
	{
		super();
		this.presenzaRimorchio=presenzaRimorchio;
		this.numeroRuoteMotrici=numeroRuoteMotrici;
		this.velocita=velocita;
	}

	public boolean isPresenzaRimorchio() {
		return presenzaRimorchio;
	}

	public void setPresenzaRimorchio(boolean presenzaRimorchio) {
		this.presenzaRimorchio = presenzaRimorchio;
	}

	public Integer getNumeroRuoteMotrici() {
		return numeroRuoteMotrici;
	}

	public void setNumeroRuoteMotrici(Integer numeroRuoteMotrici) {
		this.numeroRuoteMotrici = numeroRuoteMotrici;
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
		+ " presenza rimorchio: "+this.isPresenzaRimorchio()
		+ " num ruote motrici: "+this.getNumeroRuoteMotrici()
		+ " velocita: "+this.getVelocita()+"km/h";
		
		
	}

	@Override
	public int accelera() {
		// TODO Auto-generated method stub
		
		this.velocita = this.velocita+10;
		
		return this.velocita;
	}
	
	@Override
	public int decelera()
	{
		this.velocita=this.velocita - 10;
		return this.velocita;
	}
	
	

}
