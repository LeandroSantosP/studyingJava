package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchCaseTest {


    @Test
    void shouldReturnSunday() throws Exception {
        SwitchCase switchCase = new SwitchCase();
        String output = switchCase.exec(7);
        assertEquals(output, "DIA DA SEMANA: sabado");
    }

}