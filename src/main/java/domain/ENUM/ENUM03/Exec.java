package domain.ENUM.ENUM03;

public class Exec {

    public static void main(String[] args) {
        for (Document t : Document.values()){
            System.out.println(t + " " + t.getValue());
        }

        // Set-CPF
        Document cpf = Document.CPF;
        cpf.setValue("25861738726");
        Person pf = new Person(cpf);
        System.out.println(pf.toString());

        // Generate-CNPJ
        Document cnpj = Document.CNPJ;
        Person pj = new Person(cnpj);
        System.out.println(pj.toString());
    }
}
