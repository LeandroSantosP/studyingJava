package domain.Stoke;

public class StokeEntryService {
    private final StokeEntryRepository stokeEntryRepository;
    public record StokeEntryIncreaseInput(int productId, int quantity) {
    }
    public record StokeEntryCalculateOutput(int getStokeQuantity, boolean isAvailable) {
    }

    public StokeEntryService(StokeEntryRepository stokeEntryRepository) {
        this.stokeEntryRepository = stokeEntryRepository;
    }


    public StokeEntryCalculateOutput calculateStoke(int productId) {
        return new StokeEntryCalculateOutput(3, true);
    }

    public void increase(StokeEntryIncreaseInput input) {
        // possible business rule: Check if product exists and if the stoke is greater than 0;
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "in");
        this.stokeEntryRepository.persist(stokeEntry);
    }


    public void decrease(StokeEntryIncreaseInput input) {
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "out");
        this.stokeEntryRepository.persist(stokeEntry);
    }
}
