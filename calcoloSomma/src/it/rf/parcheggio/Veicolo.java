package it.rf.parcheggio;

public abstract class Veicolo implements Accelerante{
	
	private String targa;
	private String colore;
	private String numTelaio;
	private Integer cilindrata;
	private Integer velocita;
	
	public Veicolo() {}
	
	public Veicolo(String targa,String colore,String numTelaio,Integer cilindrata)
	{
		super();
		this.targa=targa;
		this.colore=colore;
		this.numTelaio=numTelaio;
		this.cilindrata=cilindrata;
	}
	
	
	public String getTarga()
	{
		return this.targa;
	}
	public void setTarga(String targa)
	{
		this.targa=targa;
	}
	
	public String getColore()
	{
		return this.colore;
	}
	public void setColore(String colore)
	{
		this.colore=colore;
	}
	
	public String getNumTelaio()
	{
		return this.numTelaio;
	}
	public void setNumTelaio(String numTelaio)
	{
		this.numTelaio=numTelaio;
	}
	
	public Integer getCilindrata()
	{
		return this.cilindrata;
	}
	public void setCilindrata(Integer cilindrata)
	{
		this.cilindrata=cilindrata;
	}
	
	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public abstract int accelera();
	public abstract int decelera();
}
