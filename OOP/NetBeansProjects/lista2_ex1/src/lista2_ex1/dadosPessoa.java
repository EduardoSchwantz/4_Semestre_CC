package lista2_ex1;

public class dadosPessoa {

    String nome;
    Data dataDeNascimento;
    float altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public Data getData() {
        return this.dataDeNascimento;
    }

    public void setData(Data data) {
        this.dataDeNascimento = data;
    }

    int calculaIdade() {
        return this.dataDeNascimento.calcularIdade();
    }

    @Override
    public String toString() {

        return "Nome: " + nome + " | Idade: " + calculaIdade() + "\n"
                + "Data de Nascimento: " + dataDeNascimento + "\n"
                + "Altura: " + altura;
    }

}
