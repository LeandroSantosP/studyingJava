package domain.Stoke;

public class StokeEntryIncrease {
    private final StokeEntryRepository stokeEntryRepository;

    public StokeEntryIncrease(StokeEntryRepository stokeEntryRepository) {
        this.stokeEntryRepository = stokeEntryRepository;
    }

    public void increase(StokeEntryIncreaseInput input) {
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "in");
        this.stokeEntryRepository.persist(stokeEntry);
    }


    public void decrease(StokeEntryIncreaseInput input) {
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "out");
        this.stokeEntryRepository.persist(stokeEntry);
    }


}
record StokeEntryIncreaseInput(int productId, int quantity) {
}