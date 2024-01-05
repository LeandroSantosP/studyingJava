package domain.ANOTHERS.ANOTHERS.AlignedClasses;


interface Text {
    public void printText(String text);
}

public class Anonymous {

    public void printText() {
        System.out.println("Anything else");
    }

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            public void printText() {
                System.out.println("Anything else modify");
            }
        };

        anonymous.printText();

        // with interfaces

        Text text = new Text() {
            @Override
            public void printText(String text) {
                System.out.println(text);
            }
        };

        text.printText("With Interface");
    }
}
