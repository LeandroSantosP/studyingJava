package domain.SOLID.application;
import domain.SOLID.domian.EmployeeTimeRecord;

import java.util.ArrayList;

public interface TimeRecordRepository {
    ArrayList<EmployeeTimeRecord> getTimeRecordByEmployeeId(int id);

}
