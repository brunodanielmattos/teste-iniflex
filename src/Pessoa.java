import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

@Override
public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "Nome: " + nome + ", Data Nascimento: " + dataNascimento.format(formatter);
}
}