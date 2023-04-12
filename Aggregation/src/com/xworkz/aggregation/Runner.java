package com.xworkz.aggregation;

public class Runner {
	
	public static void main(String[] args) {
		
		Doctors doctor = new Doctors("Swathi", 45, "MBBS", "Neurologist", "Night");
		Patient patient = new Patient("Pallavi", 34, "Migraine", 'F', "Shivamoga");
		Employee emp = new Employee("Bhagya", "Take care of patient", 50000, 9.30d, 20569);
		Treatment treat = new Treatment("Bone fracture", "Radiology", 406, "Curative", "Navya");
		
		Hospital hospt = new Hospital(doctor, patient, emp, treat);
		hospt.doctors=doctor;
		hospt.patient=patient;
		hospt.employee=emp;
		hospt.treatment=treat;
		
		System.out.println(doctor.name);
		System.out.println(doctor.age);
		System.out.println(doctor.qualification);
		System.out.println(doctor.specialistIn);
		System.out.println(doctor.shift);
		
		
	}

}
