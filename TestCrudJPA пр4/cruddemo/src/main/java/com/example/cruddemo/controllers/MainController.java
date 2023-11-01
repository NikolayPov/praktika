package com.example.cruddemo.controllers;


import com.example.cruddemo.models.Chashka;
import com.example.cruddemo.models.Drink;
import com.example.cruddemo.models.Pasport;
import com.example.cruddemo.models.Person;
import com.example.cruddemo.repo.ChashkaRepository;
import com.example.cruddemo.repo.DrinkRepository;
import com.example.cruddemo.repo.PasportRepository;
import com.example.cruddemo.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private PasportRepository pasportRepository;
    @Autowired
    private PersonRepository personRepository;



    @GetMapping("/person")
    public String Main(Model model){
        Iterable<Pasport> pasport = pasportRepository.findAll();
        model.addAttribute("pasports", pasport);
        Iterable<Person> person = personRepository.findAll();
        model.addAttribute("persons", person);
        return "person";
    }

    @PostMapping("/person/add")
    public String blogPostAdd(@RequestParam String name, @RequestParam String number, Model model)
    {
        System.out.println(name);
        Pasport pasport = pasportRepository.findByNumber(number);
        System.out.println(pasport.getId());
        Person person = new Person(name, pasport);
        personRepository.save(person);
        return "redirect:/";
    }
    @Autowired
    private DrinkRepository drinkRepository;
    @Autowired
    private ChashkaRepository chashkaRepository;

    @GetMapping("/person2")
    private String Main2(Model model){
        Iterable<Drink> drinks = drinkRepository.findAll();
        model.addAttribute("drinks", drinks);
        Iterable<Chashka> chashka = chashkaRepository.findAll();
        model.addAttribute("chachkas", chashka);

        return "person2";
    }

    @PostMapping("/person2/add")
    public String blogPostAdd2(@RequestParam String student, @RequestParam String universiti, Model model)
    {
        Drink drink2 = drinkRepository.findByName(student);
        Chashka chashka2 = chashkaRepository.findByName(universiti);
        drink2.getChashkas().add(chashka2);
        chashka2.getDrinks().add(drink2);
        drinkRepository.save(drink2);
        chashkaRepository.save(chashka2);
        return "redirect:/";
    }
}
