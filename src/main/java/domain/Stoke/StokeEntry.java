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
    private final Operation operation;
    public StokeEntry(int productId, int quantity, String operation) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantity must be a greater number than 0");
        }
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

    public String getOperation(){
        return this.operation.getOperation();
    }
}
