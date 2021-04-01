import transporte.Veiculo;

public class Usuario {
    private String nome;
    private String cpf;
    private Veiculo veiculo;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void atualizaVeiculo(String veiculo) {
        this.veiculo = Fabrica.selecionaVeiculo(veiculo);

        if (this.veiculo != null) {
            System.out.println(this.veiculo.calculaRota());
        }

    }
}
