package com.example.test.dao;

import com.example.test.model.SupplierModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SupplierDAO {

    private static int SUPPLIER_COUNT;

    private List<SupplierModel> supplier;
    {
        supplier = new ArrayList<>();

        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"ПУПСЫ1","Конфетки пипетки", "Москва",123456789));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"ПУПСЫ2","Шоколадки", "Москва",123456788));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"ПУПСЫ3","Телефоны", "Москва",123456777));
        supplier.add(new SupplierModel(++SUPPLIER_COUNT,"ПУПСЫ4","Камешки", "Москва",123456666));
    }

    public List<SupplierModel> index(){

        return supplier;
    }

    public SupplierModel show(int id){
        return supplier.stream().filter(supplierModel -> supplierModel.getId() == id).findAny().orElse(null);
    }

    public void save(SupplierModel person){
        person.setId(++SUPPLIER_COUNT);
        supplier.add(person);
    }

    public void update(int id, SupplierModel supplierModel){
        SupplierModel updateSupplier = show(id);
        updateSupplier.setNameprodukt(supplierModel.getNameprodukt());
        updateSupplier.setName(supplierModel.getName());
        updateSupplier.setAddress(supplierModel.getAddress());
        updateSupplier.setInn(supplierModel.getInn());
    }


    public void delete(int id){
        supplier.removeIf(p-> p.getId() == id);
    }
}
