package serratec.poo.classes;

public abstract class Artista {
	private String nome;
	private Genero genero;
	private double cache;
	
	public Artista(String nome, Genero genero, double cache) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public double getCache() {
		return cache;
	}
	public void setCache(double cache) {
		this.cache = cache;
	}
	
	@Override
	public String toString() {
	    return String.format("""
	    		Nome: %s 
	    		Genero: %s 	
	    		Cache: %.2f
	    		""", getNome(), getGenero(), getCache());
	}
}

