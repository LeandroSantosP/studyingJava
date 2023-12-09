package domain.SOLID.infra;


import domain.SOLID.application.TimeRecordRepository;
import domain.SOLID.domian.EmployeeTimeRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class TimeRecordRepositoryMemory implements TimeRecordRepository {

    private ArrayList<EmployeeTimeRecord> arrayList = new ArrayList<>();

    public TimeRecordRepositoryMemory() {
        var initialState = new ArrayList<EmployeeTimeRecord>();
        initialState.add(new EmployeeTimeRecord(UUID.randomUUID(), 1, new Date(2023, 12, 04), new Date(2023, 12, 04)));
        initialState.add(new EmployeeTimeRecord(UUID.randomUUID(), 1, new Date(2023, 12, 04), new Date(2023, 12, 04)));
        initialState.add(new EmployeeTimeRecord(UUID.randomUUID(), 1, new Date(2023, 12, 04), new Date(2023, 12, 04)));
        initialState.add(new EmployeeTimeRecord(UUID.randomUUID(), 1, new Date(2023, 12, 04), new Date(2023, 12, 04)));

        this.arrayList = initialState;
    }


    public ArrayList<EmployeeTimeRecord> getTimeRecordByEmployeeId(int id) {
        var response = new ArrayList<EmployeeTimeRecord>();
        for (EmployeeTimeRecord employeeTimeRecord : this.arrayList) {
            if (employeeTimeRecord.employeeId() == id) {
                response.add(employeeTimeRecord);
            }
        }
        return response;
    }
}
