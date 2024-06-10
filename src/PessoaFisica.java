import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome,  String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco, new Date());
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String toString(){
        return
        "\n===== Cliente PF ====="+
        "\nNome: " + this.nome + 
        "\nIdade: " + this.idade +
        "\nSexo: " + this.sexo +
        "\nEndereco: " + this.endereco +
        "\nCPF: " + this.cpf +
        "\n====================";
    }

    @Override
    public boolean equals(Object obj) {
        PessoaFisica pessoa = (PessoaFisica) obj;
        return cpf.equals(pessoa.cpf);
    }
}
