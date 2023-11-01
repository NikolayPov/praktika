package com.example.test.controller;

import com.example.test.dao.*;
import com.example.test.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Сontroller {


    private OrderDAO _orderDAO;
    private CarDAO _carDAO;
    private EmployeeDAO _employeeDAO;
    private SupplierDAO _supplierDAO;
    private BuyerDAO _buyerDAO;


    @Autowired
    public Сontroller(   OrderDAO orderDAO, CarDAO carDAO, EmployeeDAO employeeDAO,SupplierDAO supplierDAO,BuyerDAO buyerDAO){
        _orderDAO = orderDAO;
        _carDAO = carDAO;
        _employeeDAO = employeeDAO;
        _supplierDAO = supplierDAO;
        _buyerDAO = buyerDAO;
    }





    @GetMapping("/indexCar")
    public String indexCar(Model model){
        model.addAttribute("car", _carDAO.index());
        return "indexCar";
    }

    @GetMapping("/{id}/car")
    public String showCar(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("car", _carDAO.show(id));
        return "showCar";
    }


    @GetMapping("/newCar")
    public String newTeacher(@ModelAttribute("car") CarModel carModel){
        // model.addAttribute("person", new PersonModel());
        return "newCar";
    }

    @PostMapping("car")
    public String createCar(@ModelAttribute("car") CarModel carModel){
        _carDAO.save(carModel);
        return "redirect:/indexCar";
    }


    @GetMapping("/{id}/editCar")
    public String editCar(Model model, @PathVariable("id") int id){
        model.addAttribute("car",_carDAO.show(id));
        return "editCar";
    }



    @PatchMapping("/{id}/car")
    public String updateTeacher(@ModelAttribute("car") CarModel carModel, @PathVariable("id") int id){
        _carDAO.update(id,carModel);
        return "redirect:/indexCar";
    }

    @DeleteMapping("/{id}/car")
    public String deleteCar(@PathVariable("id") int id){
        _carDAO.delete(id);
        return "redirect:/indexCar";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexOrder")
    public String indexOrder(Model model){
        model.addAttribute("order", _orderDAO.index());
        return "indexOrder";
    }

    @GetMapping("/{id}/order")
    public String showOrder(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("order", _orderDAO.show(id));
        return "showOrder";
    }


    @GetMapping("/newOrder")
    public String newOrder(@ModelAttribute("order") OrderModel orderModel){
        // model.addAttribute("person", new PersonModel());
        return "newOrder";
    }

    @PostMapping("order")
    public String createOrder(@ModelAttribute("order") OrderModel orderModel){
        _orderDAO.save(orderModel);
        return "redirect:/indexOrder";
    }


    @GetMapping("/{id}/editOrder")
    public String editOrder(Model model, @PathVariable("id") int id){
        model.addAttribute("order",_orderDAO.show(id));
        return "editOrder";
    }



    @PatchMapping("/{id}/order")
    public String updateTeacher(@ModelAttribute("order") OrderModel orderModel, @PathVariable("id") int id){
        _orderDAO.update(id,orderModel);
        return "redirect:/indexOrder";
    }

    @DeleteMapping("/{id}/order")
    public String deleteOrder(@PathVariable("id") int id){
        _orderDAO.delete(id);
        return "redirect:/indexOrder";
    }



///////////////////////////////////////////////////////////////////////////


    @GetMapping("/indexEmployee")
    public String indexEmployee(Model model){
    model.addAttribute("employee", _employeeDAO.index());
    return "indexEmployee";
}

    @GetMapping("/{id}/employee")
    public String showEmployee(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("employee", _employeeDAO.show(id));
        return "showEmployee";
    }


    @GetMapping("/newEmployee")
    public String newEmployee(@ModelAttribute("employee") EmployeeModel employeeModel){
        // model.addAttribute("person", new PersonModel());
        return "newEmployee";
    }

    @PostMapping("employee")
    public String createEmployee(@ModelAttribute("employee") EmployeeModel employeeModel){
        _employeeDAO.save(employeeModel);
        return "redirect:/indexEmployee";
    }


    @GetMapping("/{id}/editEmployee")
    public String editEmployee(Model model, @PathVariable("id") int id){
        model.addAttribute("employee",_employeeDAO.show(id));
        return "editEmployee";
    }



    @PatchMapping("/{id}/employee")
    public String updateEmployee(@ModelAttribute("employee") EmployeeModel employeeModel, @PathVariable("id") int id){
        _employeeDAO.update(id,employeeModel);
        return "redirect:/indexEmployee";
    }

    @DeleteMapping("/{id}/employee")
    public String deleteEmployee(@PathVariable("id") int id){
        _employeeDAO.delete(id);
        return "redirect:/indexEmployee";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/indexSupplier")
    public String indexSupplier(Model model){
    model.addAttribute("supplier", _supplierDAO.index());
    return "indexSupplier";
}

    @GetMapping("/{id}/supplier")
    public String showSupplier(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("supplier", _supplierDAO.show(id));
        return "showSupplier";
    }


    @GetMapping("/newSupplier")
    public String newSupplier(@ModelAttribute("supplier") SupplierModel supplierModel){
        // model.addAttribute("person", new PersonModel());
        return "newSupplier";
    }

    @PostMapping("supplier")
    public String createSupplier(@ModelAttribute("supplier") SupplierModel supplierModel){
        _supplierDAO.save(supplierModel);
        return "redirect:/indexSupplier";
    }


    @GetMapping("/{id}/editSupplier")
    public String editSupplier(Model model, @PathVariable("id") int id){
        model.addAttribute("supplier",_supplierDAO.show(id));
        return "editSupplier";
    }



    @PatchMapping("/{id}/supplier")
    public String updateSupplier(@ModelAttribute("supplier") SupplierModel supplierModel, @PathVariable("id") int id){
        _supplierDAO.update(id,supplierModel);
        return "redirect:/indexSupplier";
    }

    @DeleteMapping("/{id}/supplier")
    public String deleteSupplier(@PathVariable("id") int id){
        _supplierDAO.delete(id);
        return "redirect:/indexSupplier";
    }

/////////////////////////////////////////////////////////////////////////////

    @GetMapping("/indexBuyer")
    public String indexBuyer(Model model){
        model.addAttribute("buyer", _buyerDAO.index());
        return "indexBuyer";
    }

    @GetMapping("/{id}/buyer")
    public String showBuyer(@PathVariable("id") int id,Model model){
        // Вывод определенного пользователя
        model.addAttribute("buyer", _buyerDAO.show(id));
        return "showBuyer";
    }


    @GetMapping("/newBuyer")
    public String newBuyer(@ModelAttribute("buyer") BuyerModel buyerModel){
        // model.addAttribute("person", new PersonModel());
        return "newBuyer";
    }

    @PostMapping("buyer")
    public String createBuyer(@ModelAttribute("buyer") BuyerModel buyerModel){
        _buyerDAO.save(buyerModel);
        return "redirect:/indexBuyer";
    }


    @GetMapping("/{id}/editBuyer")
    public String editBuyer(Model model, @PathVariable("id") int id){
        model.addAttribute("buyer",_buyerDAO.show(id));
        return "editBuyer";
    }



    @PatchMapping("/{id}/buyer")
    public String updateBuyer(@ModelAttribute("buyer") BuyerModel buyerModel, @PathVariable("id") int id){
        _buyerDAO.update(id,buyerModel);
        return "redirect:/indexBuyer";
    }

    @DeleteMapping("/{id}/buyer")
    public String deleteBuyer(@PathVariable("id") int id){
        _buyerDAO.delete(id);
        return "redirect:/indexBuyer";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/main")
    String main() {
        return "main";
    }

}
