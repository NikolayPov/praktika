package com.example.test.dao;

import com.example.test.model.EmployeeModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeDAO {
    private static int Employee_COUNT;
    private List<EmployeeModel> people;
    {
        people = new ArrayList<>();

        people.add(new EmployeeModel(++Employee_COUNT,"Екатерина", "Кузнецова","Дмитриевна","andr123","pasandr123"));
        people.add(new EmployeeModel(++Employee_COUNT,"Сергей", "Смирнов","Александрович","ivan123","pasivan123"));
        people.add(new EmployeeModel(++Employee_COUNT,"Петр", "Петров","Петрович","ars123","pasars123"));
        people.add(new EmployeeModel(++Employee_COUNT,"Иван", "Иванов","Иванович","nik123","pasnik123"));
    }

    public List<EmployeeModel> index(){

        return people;
    }

    public EmployeeModel show(int id){
        return people.stream().filter(employeeModel -> employeeModel.getId() == id).findAny().orElse(null);
    }

    public void save(EmployeeModel employee){
        employee.setId(++Employee_COUNT);
        people.add(employee);
    }

    public void update(int id, EmployeeModel employeeModel){
        EmployeeModel updateEmployee = show(id);
        updateEmployee.setName(employeeModel.getName());
        updateEmployee.setSurname(employeeModel.getSurname());
        updateEmployee.setMidname(employeeModel.getMidname());
        updateEmployee.setLogin(employeeModel.getLogin());
        updateEmployee.setPassword(employeeModel.getPassword());
    }

    public void delete(int id){
        people.removeIf(p-> p.getId() == id);
    }
}
