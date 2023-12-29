package domainTwo.Exeptions;

public class NotExactDivision extends Exception {
    public NotExactDivision(int num, int dem) {
        super(String.format("Number %s is not able to divide by %s", num, dem));
    }

}
