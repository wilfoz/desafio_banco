public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Novo");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        cc.sacar(50);

        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(50, poupanca);
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();

    }
}
