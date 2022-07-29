package DocumentWorker;
//Создайте класс DocumentWorker.
//В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
//"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//Создайте производный класс ProDocumentWorker.
//Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
//"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
//доступно в версии Эксперт".
//Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
//Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
//"Документ сохранен в новом формате".
//В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
//Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
//экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
//экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.

import java.util.Scanner;

public class DocumentWorker {
    public DocumentWorker() {
    }

    public void openDocument() {
        System.out.println("Документ открыт");
    }

    public void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    public void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ");
        int password = scanner.nextInt();
        DocumentWorker documentWorker = new DocumentWorker();

        documentWorker.keyIn(password);

    }


        public void keyIn(int key) {
            if (key == 123) {
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
            } else if (key == 321) {
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
            } else {
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
            }

        }
}

//switch (password) {
//            case 123:
//                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
//                expertDocumentWorker.openDocument();
//                expertDocumentWorker.editDocument();
//                expertDocumentWorker.openDocument();
//                break;
//            case 321:
//                ProDocumentWorker proDocumentWorker=new ProDocumentWorker();
//                proDocumentWorker.openDocument();
//                proDocumentWorker.editDocument();
//                proDocumentWorker.saveDocument();
//            default:
//                DocumentWorker documentWorker = new DocumentWorker();
//                documentWorker.openDocument();
//                documentWorker.editDocument();
//                documentWorker.saveDocument();
//        }

