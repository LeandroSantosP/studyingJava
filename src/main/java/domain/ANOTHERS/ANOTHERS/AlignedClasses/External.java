package domain.ANOTHERS.ANOTHERS.AlignedClasses;

public class External {
    private final String text = "External Text";

    public class Internal {
        private final String text = "Internal Text";
        void printText() {
            System.out.println(this.text);
            System.out.println(External.this.text);
        }
    }
    public static class InternalTwo {
        private final String text = "Internal Text Two";

        void printText() {
            System.out.println(this.text);
        }
    }

    public static void main(String[] args) {
        External external = new External();
        // Access by parent class
        Internal internal = external.new Internal();
        // Accessing decently from the instance {static is required}
        InternalTwo internalTwo = new InternalTwo();

        internal.printText();
        internalTwo.printText();
    }

}
