package com.ab;

public final class Student extends Person {

    private double gpa;
    public Student() {

    }
    public Student(String name,String surname,double gpa){
     super(name,surname);
     setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student: "+super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if(getGpa()>2.67) return 36660;
        else return 0;
    }
    @Override
    public int compareTo(Person person) {
        if (this.getPaymentAmount() > person.getPaymentAmount()) {
            return 1;
        } else if (this.getPaymentAmount() < person.getPaymentAmount()) {
            return -1;
        } else {
            return 0;
        }
    }
}
