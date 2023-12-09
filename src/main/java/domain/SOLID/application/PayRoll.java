package domain.SOLID.application;

import java.util.Date;

public class PayRoll {

    final private TimeRecordRepository timeRecordRepository;

    PayRoll(TimeRecordRepository timeRecord) {
        this.timeRecordRepository = timeRecord;
        // id , startDate, endDate
    }

    record PayRollInput(int employeeId, int month, int year) {
    }

    record PayRollOutput(String name, double salary) {
    }

    PayRollOutput execute(PayRollInput input) {
        System.out.println(new Date().getTime());
        System.out.println(this.timeRecordRepository.getTimeRecordByEmployeeId(input.employeeId).size());
        return null;
    }

}
