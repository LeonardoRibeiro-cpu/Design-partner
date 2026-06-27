public class PedidoMemento {

    private String status = "PENDENTE";
    private String snapshot;

    // MEMENTO: salva o estado atual
    public void salvar() {
        snapshot = status;
        System.out.println("Estado salvo: " + status);
    }

    // MEMENTO: restaura o estado salvo
    public void desfazer() {
        if (snapshot != null) {
            status = snapshot;
            System.out.println("Estado restaurado: " + status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}