package domain.ANOTHERS.ANOTHERS.ANNOTAIONS;

public @interface Info {
    String author();
    int age();
    double wage() default 0;
    String url() default "http://localhost:8080";
}
