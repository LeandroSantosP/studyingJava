package domain;

import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Double> notes;
    public Student(String name) {
        this.name = name;
        this.notes = new ArrayList<>();
    }
    public void addNote(Double note) {
        if (note < 0 || note > 100) {
            throw new RuntimeException();
        }
        this.notes.add(note);
    }
    private double getFinalNote() {
        double total = 0;
        for (Double note : this.notes) {
            total += note;
        }
        return total;
    }
    private boolean isPass() {
        return !(this.getFinalNote() < 60);
    }
    private double missingPoints() {
        if(this.isPass()) return 0;
        int minimalNote = 60;
        return minimalNote - this.getFinalNote();
    }
    public void print() {
        String message = this.isPass() ? "PASS" : "FAILED";
        if(this.missingPoints() == 0){
            System.out.printf("Student: %s, Final note: %.2f, %s%n", this.name, this.getFinalNote(), message);
            return;
        }
        System.out.printf("Student: %s, Final note: %.2f, %s, MissingPoints: %s%n", this.name, this.getFinalNote(), message,this.missingPoints());
    }
}
