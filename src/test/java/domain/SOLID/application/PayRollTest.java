package domain.SOLID.application;

import domain.SOLID.infra.TimeRecordRepositoryMemory;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PayRollTest {

    @Test
    void shouldCalculatePayRollToEmployeeHourly() throws ParseException {

        var payRoll = new PayRoll(new TimeRecordRepositoryMemory());
        var StokeEntryIncreaseInput = new PayRoll.PayRollInput(1, 12, 2023);
        var output = payRoll.execute(StokeEntryIncreaseInput);

        assertEquals(output.name(), "Matheus Silva");
        assertEquals(output.salary(), 420);
    }

}
