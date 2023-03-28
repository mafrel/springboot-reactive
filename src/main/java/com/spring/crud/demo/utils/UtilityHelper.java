package com.spring.crud.demo.utils;

import com.spring.crud.demo.model.SportsIcon;
import com.spring.crud.demo.model.Student;
import com.spring.crud.demo.model.emp.Address;
import com.spring.crud.demo.model.emp.Employee;
import com.spring.crud.demo.model.emp.PhoneNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UtilityHelper {

    private UtilityHelper() {
    }

    public static Supplier<List<Student>> studentSupplier = () ->
            Arrays.asList(
		            Student.builder().rollNo(1).firstName("Mafrel").lastName("Karki").marks(300.0f).build(),
		            Student.builder().rollNo(2).firstName("Ramesh").lastName("Thapa").marks(950.0f).build(),
		            Student.builder().rollNo(3).firstName("John").lastName("Smith").marks(500.0f).build(),
		            Student.builder().rollNo(4).firstName("Michael").lastName("Jackson").marks(600.0f).build(),
					Student.builder().rollNo(3).firstName("Chris").lastName("Brown").marks(500.0f).build(),
					Student.builder().rollNo(4).firstName("Shawn").lastName("M").marks(600.0f).build(),
		            Student.builder().rollNo(5).firstName("Dinesh").lastName("Khatri").marks(700.0f).build(),
		            Student.builder().rollNo(6).firstName("Subash").lastName("Timalsina").marks(800.0f).build(),
		            Student.builder().rollNo(7).firstName("Rock").lastName("S").marks(900.0f).build(),
		            Student.builder().rollNo(8).firstName("Jack").lastName("M").marks(800.0f).build(),
		            Student.builder().rollNo(9).firstName("Joseph").lastName("K").marks(900.0f).build(),
		            Student.builder().rollNo(10).firstName("Rudim").lastName("G").marks(800.0f).build()
            );



    public static Supplier<List<SportsIcon>> sportIconsSupplier = () ->
            Arrays.asList(
                    SportsIcon.builder().name("Virat").specialName("King Kohli").sports("Cricketer").age(33).olampian(false).build(),
					SportsIcon.builder().name("Neeraj").specialName("Chopra").sports("Javelin").age(25).olampian(true).build(),
					SportsIcon.builder().name("Marry").specialName("Kom").sports("Boxing").age(35).olampian(false).build(),
                    SportsIcon.builder().name("Lionel").specialName("Messi").sports("Footballer").age(35).olampian(false).build(),
                    SportsIcon.builder().name("Roger").specialName("Federer").sports("TennisPlayer").age(36).olampian(true).build(),
                    SportsIcon.builder().name("Tiger").specialName("Tiger Woods").sports("Golf").age(40).olampian(true).build(),
                    SportsIcon.builder().name("PV Sindhu").specialName("Queen").sports("Badminton").age(27).olampian(true).build()
            );




	public static Supplier<List<Employee>> employeeSupplier = () -> {

		Employee mafrel = Employee.builder()
				.id(1)
				.firstName("Mafrel")
				.lastName("Karki")
				.age(30)
				.noOfChildren(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("1000 N Street")
						.city("Fairfield")
						.state("IOWA")
						.country("USA")
						.postalCode("75050")
						.build()
				)
				.hobbies(Arrays.asList("Music", "Dance"))
				.build();

		PhoneNumber mafrelNumber = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234567890")
				.employee(mafrel)
				.build();

		mafrel.setPhoneNumbers(Arrays.asList(mafrelNumber));






		Employee dipesh = Employee.builder()
				.id(1)
				.firstName("Dipesh")
				.lastName("Singh")
				.age(28)
				.noOfChildren(0)
				.spouse(true)
				.address(Address.builder()
						.id(1)
						.streetAddress("3302 N Dixieland Rd")
						.city("Rogers")
						.state("Arkansas")
						.country("USA")
						.postalCode("560010")
						.build()
				)
				.hobbies(Arrays.asList("Dancing", "Football"))
				.build();

		PhoneNumber aryansNumber = PhoneNumber.builder()
				.id(1)
				.type("Mobile")
				.number("1234555555")
				.employee(dipesh)
				.build();

		dipesh.setPhoneNumbers(Arrays.asList(aryansNumber));


		return Arrays.asList(mafrel, dipesh);
	};
}
