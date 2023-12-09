package domain.SOLID.application;

import domain.SOLID.domian.EmployeeTimeRecord;

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

        var records = this.timeRecordRepository.getTimeRecordByEmployeeId(input.employeeId);
        int hours = 0;
        for(EmployeeTimeRecord employeeTimeRecord : records) {
           hours += (int) (employeeTimeRecord.checkOutDate().getTime() - employeeTimeRecord.checkingDate().getTime()) /(1000*60*60);
        }

        double salaryPerHourly = 30;

        double salaryTotal = hours * salaryPerHourly;

        return new PayRoll.PayRollOutput("Matheus Silva", salaryTotal);
    }

}
