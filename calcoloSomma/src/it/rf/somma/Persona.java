package it.rf.somma;

public class Persona {
	
	 private String nome;
	 private String cognome;
	 private String cf;
	
	public Persona() {}
	
	public Persona(String nome, String cognome, String cf) 
	{
		this.nome=nome;
		this.nome=nome;
		this.nome=cf;
		
	}
	
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	
	public String getCognome()
	{
		return this.cognome;
	}
	public void setCognome(String cognome)
	{
		this.cognome=cognome;
	}
	
	
	public String getCf()
	{
		return this.cf;
	}
	public void setCf(String cf)
	{
		this.cf=cf;
	}
	
	
}
