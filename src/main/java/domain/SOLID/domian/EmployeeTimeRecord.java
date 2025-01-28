package domain.SOLID.domian;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public record EmployeeTimeRecord(UUID id, int employeeId, Date checkingDate, Date checkOutDate) {
}
