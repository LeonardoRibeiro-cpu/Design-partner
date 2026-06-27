public class Main {

    public static void main(String[] args) {

        // --- FACADE ---
        System.out.println("=== Facade ===");
        PedidoFacade facade = new PedidoFacade();
        facade.realizarPedido();

        // --- MEMENTO ---
        System.out.println("\n=== Memento ===");
        PedidoMemento memento = new PedidoMemento();

        memento.salvar();                    // salva "PENDENTE"
        memento.setStatus("CONFIRMADO");
        System.out.println("Status atual: " + memento.getStatus());

        memento.desfazer();                  // volta para "PENDENTE"
        System.out.println("Status atual: " + memento.getStatus());
    }
}