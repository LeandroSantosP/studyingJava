package domain.Stoke;

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
    private final int productId;
    private final int quantity;
    public final Operation operation;
    public StokeEntry(int productId, int quantity, String operation) {
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
}
