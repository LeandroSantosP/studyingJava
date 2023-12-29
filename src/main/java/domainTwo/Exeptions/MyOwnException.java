package domainTwo.Exeptions;

public class MyOwnException {

    public static void main(String[] args) {
        int[] numbs = {2, 3, 6, 20, 30, 20};
        int[] demon = {2, 4, 4, 8, 3, 2};
        int count = 0;
        int failer = 0;
        OutExec outExec = exec(numbs, demon, count, failer);
        System.out.println("Finished, Success loop interactions: " + outExec.count + " Total failed: " + outExec.failed);

    }

    private record OutExec(int count, int failed) {
    }

    static OutExec exec(int[] numbs, int[] demon, int count, int failed) {

        int[]s =  new int[10];

        for (int i = 0; i < numbs.length; i++) {
            try {
                if (numbs[i] % 2 != 0) {
                    throw new NotExactDivision(numbs[i], demon[i]);
                }
                int resul = numbs[i] / demon[i];
                System.out.println(numbs[i] + " / " + demon[i] + " = " + resul);
                count++;
            } catch (Exception e) {
                failed++;
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return new OutExec(count, failed);
    }
}
