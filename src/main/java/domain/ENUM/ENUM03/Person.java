package domain.ENUM.ENUM03;

public class Person {
    private final Document document;

    public Person(Document documentType) {
        this.document = documentType;
    }

    public Document getDocument() {
        return document;
    }

    public String getDocNum() {
        return this.document.getValue();
    }

    @Override
    public String toString() {
        return "Person{" +
                "documentType=" + this.getDocument() +
                ", docNum='" + this.getDocNum() + '\'' +
                '}';
    }
}
