package com.cognizant;

 class Employee {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    // Private constructor
    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Display Method
    public void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Address : " + address);
    }

    // Static Builder Class
    public static class EmployeeBuilder {

        private int id;
        private String name;
        private String email;
        private String phone;
        private String address;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
 public class Builder_pattern {

	    public static void main(String[] args) {

	        Employee emp =
	                new Employee.EmployeeBuilder()
	                        .setId(1)
	                        .setName("Rahul")
	                        .setEmail("rahul@gmail.com")
	                        .setPhone("9999999999")
	                        .setAddress("Delhi")
	                        .build();

	        emp.display();
	    }
	}