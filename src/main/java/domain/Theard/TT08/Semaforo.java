package domain.Theard.TT08;

public class Semaforo implements Runnable {

    private Color color;
    private boolean stop;
    private boolean colorChange;

    public Semaforo() {
        this.color = Color.RED;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!this.stop) {
            try {
                Thread.sleep(this.color.getWaitingTime());
                this.toggleColor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Semaforo Stop");
    }

    synchronized private void toggleColor() {
        switch (this.color) {
            case RED -> this.color = Color.GREEN;
            case YELLOW -> this.color = Color.RED;
            case GREEN -> this.color = Color.YELLOW;
        }
        this.colorChange = true;
        notify();
    }

    public synchronized void waitColorChange() {
        while (!this.colorChange) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.colorChange = false;
    }

    public void stopSemaforo() {
        this.stop = true;
    }

    public String getColor() {
        return color.name();
    }
}
