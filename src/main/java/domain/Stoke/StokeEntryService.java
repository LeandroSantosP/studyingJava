package domain.Stoke;

import java.util.List;
import java.util.Objects;

public class StokeEntryService {
    private final StokeEntryRepository stokeEntryRepository;
    public record StokeEntryIncreaseInput(int productId, int quantity) {
    }

    public record StokeEntryDecreaseInput(int productId, int quantity) {
    }
    public record StokeEntryCalculateOutput(int getStokeQuantity, boolean isAvailable) {
    }

    public StokeEntryService(StokeEntryRepository stokeEntryRepository) {
        this.stokeEntryRepository = stokeEntryRepository;
    }

    public StokeEntryCalculateOutput calculateStoke(int productId) {
        List<StokeEntry> stokeEntries = this.stokeEntryRepository.getAllStokeEntriesByProductId(productId);
        StokeCalculator.StokeCalculatorOutput stokeCalculator = StokeCalculator.execute(stokeEntries);
        return new StokeEntryCalculateOutput(stokeCalculator.total(), stokeCalculator.isAvailable());
    }

    public void increase(StokeEntryIncreaseInput input) {
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "in");
        this.stokeEntryRepository.persist(stokeEntry);
    }

    public void decrease(StokeEntryDecreaseInput input) {
        // possible business rule: Check if product exists and if stoke is greater than 0;
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "out");
        this.stokeEntryRepository.persist(stokeEntry);
    }
}
