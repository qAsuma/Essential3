package DocumentWorker;

public class ProDocumentWorker extends DocumentWorker {
    public ProDocumentWorker() {
    }

    public void openDocument() {
        System.out.println("документ открыт");
    }

    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
