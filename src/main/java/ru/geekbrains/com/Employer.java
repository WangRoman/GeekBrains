package ru.geekbrains.com;

public class Employer {
    public String FIO;
    public String position;
    public String email;
    public String phone_number;
    public int salary;
    public int age;

    public Employer(String FIO, String position, String email, String phone_number, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employer[] empArr = new Employer[5];
        empArr[0] = new Employer("Roman Rakhimov", "Supply manager", "roman.rakhimov@musicaeterna.org", "89111330895", 80000, 36);
        empArr[1] = new Employer("Alexandr Gorshkov", "System administrator", "alexandr.gorshkov@musicaeterna.org", "89263476443", 70000, 37);
        empArr[2] = new Employer("Tatyana Savchenko", "Department chief", "tatyana.savchenko@musicaeterna.org", "89524753950", 100000, 42);
        empArr[3] = new Employer("Linar Nugumanov", "Fireman", "linar.nugumanov@musicaeterna.org", "89063472398", 60000, 33);
        empArr[4] = new Employer("Catherine Ustinova", "Producer", "catherine.ustinova@musicaeterna.org", "89025835047", 80000, 32);

        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].age >= 40) {
                System.out.println(empArr[i].FIO + ", " + empArr[i].position + ", " + empArr[i].email +
                        ", " + empArr[i].phone_number + ", " + empArr[i].salary + ", " + empArr[i].age);
            }
        }
    }

}
