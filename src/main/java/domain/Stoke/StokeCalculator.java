package domain.Stoke;

import java.util.List;
import java.util.Objects;

public class StokeCalculator {

    public record StokeCalculatorOutput(int total, boolean isAvailable) {
    }

    static StokeCalculatorOutput execute(List<StokeEntry> stokeEntries) {
        int total = 0;
        for (StokeEntry stokeEntry : stokeEntries) {
            if (Objects.equals(stokeEntry.getOperation(), "in")) {
                total += stokeEntry.getQuantity();
            }
            if (Objects.equals(stokeEntry.getOperation(), "out")) {
                total -= stokeEntry.getQuantity();
            }
        }
        boolean isAvailable = total != 0;
        return new StokeCalculatorOutput(total, isAvailable);
    }
}
