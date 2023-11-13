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
        int total = 0;
        for(StokeEntry stokeEntry : stokeEntries){
            if(Objects.equals(stokeEntry.getOperation(), "in")){
                total += stokeEntry.getQuantity();
            }
            if(Objects.equals(stokeEntry.getOperation(), "out")) {
                total -= stokeEntry.getQuantity();
            }
        }
        boolean isAvailable = total != 0;
        return new StokeEntryCalculateOutput(total, isAvailable);
    }

    public void increase(StokeEntryIncreaseInput input) {
        // possible business rule: Check if product exists and if stoke is greater than 0;
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "in");
        this.stokeEntryRepository.persist(stokeEntry);
    }


    public void decrease(StokeEntryDecreaseInput input) {
        StokeEntry stokeEntry = new StokeEntry(input.productId(), input.quantity(), "out");
        this.stokeEntryRepository.persist(stokeEntry);
    }
}
