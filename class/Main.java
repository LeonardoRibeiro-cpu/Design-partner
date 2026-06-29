public class Main {

    public static void main(String[] args) {

        // --- FACADE ---
        System.out.println("=== Facade ===");
        PedidoFacade facade = new PedidoFacade();
        facade.realizarPedido();

        // --- MEMENTO ---
        System.out.println("\n=== Memento ===");
        PedidoMemento memento = new PedidoMemento();

        memento.salvar(); // salva "PENDENTE"
        memento.setStatus("CONFIRMADO");
        System.out.println("Status atual: " + memento.getStatus());

        memento.desfazer(); // volta para "PENDENTE"
        System.out.println("Status atual: " + memento.getStatus());

        // --- BUILDER ---
        System.out.println("\n=== BUILDER ===");
        PedidoBuilder pedido = new PedidoBuilder.Builder()
                .pao("Brioche")
                .carne("Moída")
                .queijo("Cheddar")
                .bacon(true)
                .alface(true)
                .tomate(false)
                .molho("Barbecue")
                .build(); // MONTA E DEVOLVE O OBJETO FINAL

        pedido.exibirPedido();

        // --- ITERATOR ---
        System.out.println("\n=== Iterator ===");

        PedidoIterator iterator = new PedidoIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}