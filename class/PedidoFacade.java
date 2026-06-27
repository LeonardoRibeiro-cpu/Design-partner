public class PedidoFacade {

    // FACADE: esconde os passos internos numa unica chamada
    public void realizarPedido() {
        validar();
        pagar();
        enviar();
        System.out.println("Pedido finalizado!");
    }

    private void validar() {
        System.out.println("Validando pedido...");
    }

    private void pagar() {
        System.out.println("Processando pagamento...");
    }

    private void enviar() {
        System.out.println("Enviando para entrega...");
    }
}