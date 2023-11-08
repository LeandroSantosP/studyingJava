package domain;

import java.util.Objects;
import java.util.UUID;

public class ProjectOne {
    public ProjectOne(UUID id, String name, Double price) {
        this.id = Objects.requireNonNullElseGet(id, UUID::randomUUID);
        this.name = name;
        this.price = price;
    }

    private final UUID id;
    public final String name;
    public final Double price;

    public UUID getId() {
        return id;
    }

}
