package domain.Theard;

public class TicTac {

    boolean tic;

    synchronized public void tic(boolean isExec) {
        if (!isExec) {
            this.tic = true;
            notify();
            return;
        }
        System.out.print("Tic");
        this.tic = true;
        notify();
        while (this.tic) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized public void tac(boolean isExec) {
        if (!isExec) {
            this.tic = false;
            notify();
            return;
        }
        System.out.println("Tac");
        this.tic = false;
        notify();
        while (!this.tic) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
