package domain.Stoke;

import java.util.UUID;

class Operation {
  private final String value;
    public Operation(String value)  {
        switch (value) {
            case "in", "out":
                this.value = value;
                break;
            default: throw new IllegalArgumentException("Invalid Operation: " + value);
        }
    }
    public String getOperation() {
        return value;
    }
}
public class StokeEntry {
    private UUID id;
    private final int productId;
    private final int quantity;
    private final Operation operation;
    public StokeEntry(int productId, int quantity, String operation) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantity must be a greater number than 0");
        }
        this.id = UUID.randomUUID();
        this.productId = productId;
        this.quantity = quantity;
        this.operation = new Operation(operation);
    }
    public int getQuantity() {
        return quantity;
    }
    public int getProductId() {
        return productId;
    }

    public UUID getId(){
        return this.id;
    }

    public String getOperation(){
        return this.operation.getOperation();
    }
}
