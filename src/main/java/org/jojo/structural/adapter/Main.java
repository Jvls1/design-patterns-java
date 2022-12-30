package org.jojo.structural.adapter;

public class Main {

    public static void main(String[] args) {
        /** Using Class/Two-way adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);

        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        String card = cardDesigner.designCard(adapter);
        System.out.println(card);

        /** Using Object Adapter **/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = cardDesigner.designCard(objectAdapter);
        System.out.println(card);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("João Vitor");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
