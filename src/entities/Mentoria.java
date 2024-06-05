package entities;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Titulo: " + super.getTitulo() + ", descricao: " + super.getDescricao() + ", data: " + data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
