package DocumentWorker;



public class ExpertDocumentWorker extends ProDocumentWorker {
    public ExpertDocumentWorker() {
    }

    public void openDocument() {
        System.out.println("документ открыт");
    }

    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
