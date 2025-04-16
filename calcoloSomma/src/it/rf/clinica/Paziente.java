package it.rf.clinica;

public class Paziente extends Persona{

	
	String dataRicovero;
	
	public Paziente() {};
	
	public Paziente(String nome, String cognome, String cf,String dataRicovero) {
		super();
		this.dataRicovero=dataRicovero;
	}
	
	public String getDataInternamento()
	{
		return this.dataRicovero;
	}
	
	public void setDataRicovero(String dataRicovero)
	{
		this.dataRicovero=dataRicovero;
	}
}
