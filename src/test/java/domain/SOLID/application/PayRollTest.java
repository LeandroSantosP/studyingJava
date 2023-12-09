package domain.SOLID.application;

import domain.SOLID.application.PayRoll;
import domain.SOLID.infra.TimeRecordRepositoryMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayRollTest {

    @Test
    void shouldCalculatePayRollToEmployeePedro() {

        var payRoll = new PayRoll(new TimeRecordRepositoryMemory());
        var StokeEntryIncreaseInput = new PayRoll.PayRollInput(1, 12, 2023);
        payRoll.execute(StokeEntryIncreaseInput);
    }

}
