package domain.ENUM.ENUM02;

public enum Gender {
    FEMALE('F'), MALE('M');

    private final char TYPE;

    Gender(char type) {
        this.TYPE = type;
    }

    public char getTYPE() {
        return TYPE;
    }
}
