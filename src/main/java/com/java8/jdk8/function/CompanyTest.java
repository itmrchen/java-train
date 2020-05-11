package com.java8.jdk8.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author chenbo
 * @date 2020/5/10 17:55
 */
public class CompanyTest {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("A公司");
        Employee employee1 = new Employee();
        employee1.setUsername("zhangsan");
        Employee employee2 = new Employee();
        employee2.setUsername("lisi");
        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        company.setEmployees(employeeList);
        List<Employee> employees = company.getEmployees();
        Optional<Company> companyOptional = Optional.ofNullable(company);
        System.out.println(companyOptional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));

    }
}
