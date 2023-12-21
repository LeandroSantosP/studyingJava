package domain.Theard;

public class ThreadTicTac implements Runnable {
    TicTac tt;
    Thread t;
    final int NUM = 5;
    public ThreadTicTac(String name, TicTac tt) {
        this.tt = tt;
        this.t = new Thread(this, name);
        this.t.start();
    }
    @Override
    public void run() {
        if (this.t.getName().equalsIgnoreCase("Tic")) {
            for (int i = 0; i < this.NUM; i++) {
                tt.tic(true);
            }
            tt.tic(false);
        } else {
            for (int i = 0; i < this.NUM; i++) {
                tt.tac(true);
            }
            tt.tac(false);
        }
    }
}
