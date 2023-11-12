package domain.Stoke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StokeEntryIncreaseTest {
    @Test
    void shouldBePossibleIncreaseAnProductOnStoke() throws NoSuchStokeEntryException {
        StokeEntryRepository stokeEntryRepositoryMemory = new StokeEntryRepositoryMemory();
        StokeEntryIncrease stokeEntry = new StokeEntryIncrease(stokeEntryRepositoryMemory);
        var StokeEntryIncreaseInput = new StokeEntryIncreaseInput(1, 10);
        stokeEntry.increase(StokeEntryIncreaseInput);
        var operation = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).operation.getOperation();
        var productId = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getProductId();
        var quantity = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getQuantity();
        assertEquals(productId, 1);
        assertEquals(quantity, 10);
        assertEquals(operation, "in");
        assertNotEquals(operation, "out");
    }
}
