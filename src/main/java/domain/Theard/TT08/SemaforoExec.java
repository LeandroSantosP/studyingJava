package domain.Theard.TT08;

public class SemaforoExec {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getColor());
            semaforo.waitColorChange();
        }
        semaforo.stopSemaforo();
    }
}
