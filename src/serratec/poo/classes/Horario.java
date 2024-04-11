package serratec.poo.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horario {
	private LocalTime horario;
	private Artista artista;
	private LocalDate data;
	private Palco palco;
	
	public Horario(LocalTime horario, LocalDate data, Artista artista, Palco palco) {
		this.horario = horario;
		this.data = data;
		this.artista = artista;
		this.palco = palco;
	}
	
	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        return String.format("""
        		\nHorario: %s
        		Data: %s
        		%s
        		""", getHorario(), dataFormatada, artista);
    }
}
