package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyFacade {

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    @Autowired
    public CompanyFacade(CompanyDao companyDao,EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void retrieveCompaniesWithGivenFirstThreeCharacters(String paramCompany) throws SearchExceptions {
        boolean wasError = false;
        List<Company> companies = new ArrayList<>();
        try {
            LOGGER.info("Searching companies with given first three characters...");
            companies = companyDao.retrieveCompanyWIthGivenFirstThreeCharacters(paramCompany);
            if (paramCompany.length() != 5) {
                LOGGER.error(SearchExceptions.ERR_CHARS_LENGTH_ERROR);
                wasError = true;
                throw new SearchExceptions(SearchExceptions.ERR_CHARS_LENGTH_ERROR);
            }
        } finally {
            if (companies.size() > 0 && wasError == false)
                for (Company company : companies)
                    System.out.println(company.getName());
            else
                LOGGER.info(SearchExceptions.NO_DATA_FOUND_INFO);
        }
    }

    public void retrieveEmployeesWithGivenLastname(String employeeLastname) {
        List<Employee> employees;

        LOGGER.info("Searching employees with given name...");
        employees = employeeDao.retrieveEmployeesWithGivenName(employeeLastname);
        if (employees.size() > 0) {
            for (Employee employee : employees)
                System.out.println(employee.getFirstname() + " " + employee.getLastname() );
        }
        else
            LOGGER.info(SearchExceptions.NO_DATA_FOUND_INFO);
    }
}
