package domainTwo.Exeptions;

public class MyOwnException {

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 20, 30, 20};
        int[] demon = {2, 4, 4, 8, 3, 2};
        int count = 0;
        int failer = 0;
        for (int i = 0; i < numbs.length; i++) {
            try {
                if (numbs[i] % 2 != 0) {
                    throw new NotExactDivision(numbs[i], demon[i]);
                }
                int resul = numbs[i] / demon[i];
                System.out.println(numbs[i] + " / " + demon[i] + " = " + resul);
                count++;
            } catch (Exception e) {
                failer++;
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Finished, Success loop interactions: " + count + " Total failed: " + failer);
    }
}
