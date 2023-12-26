package domain.ANOTHERS.AlignedClasses;

public class Local {
    public void exec() {
        class LocalCass {
            private final String text = "Local class";

            void printText() {
                System.out.println(this.text);
            }
        }
        new LocalCass().printText();
    }

    public static void main(String[] args) {
        Local local=new Local();
        local.exec();
    }
}
