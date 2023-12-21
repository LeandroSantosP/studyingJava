package domain.Stoke;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StokeEntryServiceTest {
    private StokeEntryRepository stokeEntryRepositoryMemory;
    private StokeEntryService StokeEntryService;

    @BeforeEach
    void setUp() {
        stokeEntryRepositoryMemory = new StokeEntryRepositoryMemory();
        StokeEntryService = new StokeEntryService(stokeEntryRepositoryMemory);
    }

    @Test
    void shouldBePossibleIncreaseAnProductOnStoke() throws NoSuchStokeEntryException {
        StokeEntryRepository stokeEntryRepositoryMemory = this.stokeEntryRepositoryMemory;
        StokeEntryService StokeEntryService = this.StokeEntryService;
        var StokeEntryIncreaseInput = new StokeEntryService.StokeEntryIncreaseInput(1, 10);
        StokeEntryService.increase(StokeEntryIncreaseInput);
        var operation = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getOperation();
        var productId = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getProductId();
        var quantity = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getQuantity();
        assertEquals(productId, 1);
        assertEquals(quantity, 10);
        assertEquals(operation, "in");
        assertNotEquals(operation, "out");
    }
    @Test
    void shouldBePossibleDecreaseAnProductOnStoke() throws NoSuchStokeEntryException {
        StokeEntryRepository stokeEntryRepositoryMemory = this.stokeEntryRepositoryMemory;
        StokeEntryService StokeEntryService = this.StokeEntryService;
        var StokeEntryDecreaseInput = new StokeEntryService.StokeEntryDecreaseInput(1, 10);
        StokeEntryService.decrease(StokeEntryDecreaseInput);
        var operation = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getOperation();
        var productId = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getProductId();
        var quantity = stokeEntryRepositoryMemory.getStokeEntryByProductId(1).getQuantity();
        assertEquals(productId, 1);
        assertEquals(quantity, 10);
        assertEquals(operation, "out");
        assertNotEquals(operation, "in");
    }


    @Test
    void shouldBeAbleCalculateStokeEntry() throws NoSuchStokeEntryException {
        StokeEntryService StokeEntryService = this.StokeEntryService;
        var StokeEntryIncreaseInput = new StokeEntryService.StokeEntryIncreaseInput(1, 10);
        var StokeEntryDecreaseInput = new StokeEntryService.StokeEntryDecreaseInput(1, 7);
        StokeEntryService.increase(StokeEntryIncreaseInput);
        StokeEntryService.decrease(StokeEntryDecreaseInput);
        var output = StokeEntryService.calculateStoke(1);
        assertEquals(output.getStokeQuantity(), 3);
        assertTrue(output.isAvailable());
    }

}
