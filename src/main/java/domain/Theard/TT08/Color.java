package domain.Theard.TT08;

public enum Color {
    YELLOW(400), GREEN(2000), RED(3000);
    private final int WAITING_TIME;
    Color(int waitingTime) {
        this.WAITING_TIME = waitingTime;
    }
    public int getWaitingTime() {
        return this.WAITING_TIME;
    }
}
