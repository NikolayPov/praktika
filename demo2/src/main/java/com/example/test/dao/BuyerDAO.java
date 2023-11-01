package com.example.test.dao;

import com.example.test.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

import com.example.test.model.BuyerModel;
import com.example.test.model.OrderModel;
import org.springframework.stereotype.Component;
@Component
public class BuyerDAO {

    private static int Buyer_COUNT;
    private List<BuyerModel> people;
    {
        people = new ArrayList<>();

        people.add(new BuyerModel(++Buyer_COUNT,"Екатерина", "Кузнецова","Дмитриевна","andr123","pasandr123"));
        people.add(new BuyerModel(++Buyer_COUNT,"Сергей", "Смирнов","Александрович","ivan123","pasivan123"));
        people.add(new BuyerModel(++Buyer_COUNT,"Петр", "Петров","Петрович","ars123","pasars123"));
        people.add(new BuyerModel(++Buyer_COUNT,"Иван", "Иванов","Иванович","nik123","pasnik123"));
    }

    public List<BuyerModel> index(){

        return people;
    }

    public BuyerModel show(int id){
        return people.stream().filter(buyerModel -> buyerModel.getId() == id).findAny().orElse(null);
    }

    public void save(BuyerModel buyer){
        buyer.setId(++Buyer_COUNT);
        people.add(buyer);
    }

    public void update(int id, BuyerModel buyerModel){
        BuyerModel updateBuyer = show(id);
        updateBuyer.setName(buyerModel.getName());
        updateBuyer.setSurname(buyerModel.getSurname());
        updateBuyer.setMidname(buyerModel.getMidname());
        updateBuyer.setLogin(buyerModel.getLogin());
        updateBuyer.setPassword(buyerModel.getPassword());
    }

    public void delete(int id){
        people.removeIf(p-> p.getId() == id);
    }
}
