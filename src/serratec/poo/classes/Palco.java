package serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
    private String nome;
    private int capacidade;
    private List<Horario> listaHorariosShow = new ArrayList<>();

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Horario> getListaHorarios() {
        return listaHorariosShow;
    }

    public void setListaHorarios(List<Horario> listaHorariosShow) {
        this.listaHorariosShow = listaHorariosShow;
    }

    public void adicionarArtistaHorario(Horario horario) {
        listaHorariosShow.add(horario);
    }

    public void removerArtista(Artista artista) {
        List<Horario> horariosParaRemover = new ArrayList<>();
        for (Horario horario : listaHorariosShow) {
            if (horario.getArtista().equals(artista)) {
                horariosParaRemover.add(horario);
            }
        }
        listaHorariosShow.removeAll(horariosParaRemover);
    }

    @Override
    public String toString() {
        return String.format("""
                Palco: %s
                Capacidade: %d
                %s
                """, nome, capacidade, getListaHorarios());
    }
}
