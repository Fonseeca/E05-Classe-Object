public class Main {
    public static void main(String[] args) {

        PessoaFisica Joao = new PessoaFisica("Joao", "Rua Principal", "111.111.111.11", 25, 'm');
        PessoaFisica Maria = new PessoaFisica("Maria", "Avenida Central", "222.222.222.22", 30, 'f');
        PessoaFisica Carlos = new PessoaFisica("Carlos", "Rua da Praia", "333.333.333.33", 35, 'm');

        PessoaJuridica EmpresaX = new PessoaJuridica("EmpresaX", "Rua das Empresas", "333333333", 5, "Empresa A");
        PessoaJuridica EmpresaY = new PessoaJuridica("EmpresaY", "Rua das Indústrias", "444444444", 8, "Empresa B");
        PessoaJuridica EmpresaZ = new PessoaJuridica("EmpresaZ", "Avenida dos Negócios", "555555555", 10, "Empresa C");

        Conta conta1 = new Conta(5678, EmpresaX, 500, 2000);
        Conta conta2 = new Conta(9876, Joao, 100, 3000);
        Conta conta3 = new Conta(2468, Maria, 300, 5000);
        Conta conta4 = new Conta(1357, Carlos, 700, 4000);

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.depositar(300);
        conta1.sacar(100);

        conta2.transferir(conta1, 500);
        conta2.depositar(500);

        conta3.transferir(conta1, 200);
        conta3.depositar(1000);

        conta4.depositar(800);
        conta4.sacar(200);

        System.out.println(conta2);
        conta1.imprimirExtrato();

        System.out.println(Joao);
        System.out.println(EmpresaX);

        @SuppressWarnings("unused")
        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();

        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("Joao == Maria ? " + Joao.equals(Maria));
        System.out.println("EmpresaX == EmpresaY ? " + EmpresaX.equals(EmpresaY));
    }
}
