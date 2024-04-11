package serratec.poo.classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Festival {

	public static void main(String[] args) {
		System.out.println("                              SHOWS DA EXPO CORDEIRO 2025\n");
		Palco palcoPrincipal = new Palco("Palco Mundi", 5655664);
		Palco palcoNenem = new Palco("Palco Nenem", 775664);
		
		Artista banda = new Banda("Calcinha branca", Genero.Forro, 1425500);
		Artista dj = new Dj("Dj Cabeça de Gelo", Genero.Funk, 435500);
		Artista banda2 = new Banda("Calebinho", Genero. Trap, 5625500);
		Artista banda3 = new Banda("ExaltaDjamba", Genero.Pagode, 1500);
		Artista banda4 = new Banda("Ano castelo", Genero.Sertanejo, 194215500);
		Artista dj2 = new Dj("Zope do doro", Genero.Trap, 4565500);
		
		Horario horario1 = new Horario(LocalTime.of(15, 30), LocalDate.of(2024, 12, 4), banda4, palcoPrincipal);
		Horario horario2 = new Horario(LocalTime.of(17, 30), LocalDate.of(2024, 12, 4), dj, palcoPrincipal);
		Horario horario3 = new Horario(LocalTime.of(18, 45), LocalDate.of(2024, 12, 5), dj2, palcoPrincipal);
		palcoPrincipal.adicionarArtistaHorario(horario1);
		palcoPrincipal.adicionarArtistaHorario(horario2);
		palcoPrincipal.adicionarArtistaHorario(horario3);
		
		Horario horario5 = new Horario(LocalTime.of(20, 30), LocalDate.of(2024, 12, 5), banda2, palcoNenem);
		Horario horario4 = new Horario(LocalTime.of(22, 30), LocalDate.of(2024, 12, 6), banda3, palcoNenem);
		palcoNenem.adicionarArtistaHorario(horario5);
		palcoNenem.adicionarArtistaHorario(horario4);
		
		//palcoPrincipal.removerArtista(banda4);
		//System.out.println("Artista removido do Palco Principal: " + banda4);
		
		System.out.println(palcoPrincipal);
		System.out.println(palcoNenem);
		
	}
}
