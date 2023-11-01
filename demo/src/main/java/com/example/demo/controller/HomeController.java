package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class HomeController {

    @GetMapping("/home")
    String home(Model model, @RequestParam(value = "NamePrint", required = false, defaultValue = "") String name) {

        return "home";
    }

    @PostMapping("/home")
    String toPrintText(Model model, @RequestParam(value = "NamePrint") String name)
    {


        model.addAttribute("name", name);

        return "home";
    }

    @PostMapping("/calc")
    String toPrintText1(Model model, @RequestParam(value = "number1") Double name,@RequestParam(value = "number2")Double name1,@RequestParam(value = "Select1")String name2)
    {
        Double rez;

        switch (name2) {
            case ("+"):
                rez = (name + name1);
                model.addAttribute("name", rez);
                break;
            case ("-"):
                rez = (name - name1);
                model.addAttribute("name", rez);
                break;
            case ("*"):
                rez = (name * name1);
                model.addAttribute("name", rez);
                break;
            case ("/"):
                rez = (name / name1);
                model.addAttribute("name", rez);
                break;
            case ("%"):
                rez = (name % name1);
                model.addAttribute("name", rez);
                break;

        }
        return "rezult";
    }

    @PostMapping("/valut")
    String toPrintText2(Model model, @RequestParam(value = "pets") String name,@RequestParam(value = "pets1")String name1,@RequestParam(value = "NamePrint")double name2)
    {
        Double rez;
        if(name.equals(name1) ){
            rez = name2;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Rubles") &&  name1.equals("Dollars")){
            rez = name2 / 97;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Rubles") &&  name1.equals("Euro")){
            rez = name2 / 102;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Rubles") &&  name1.equals("Hryvnia")){
            rez = name2 / 3;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Dollars") &&  name1.equals("Rubles")){
            rez = name2 * 0.0102;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Dollars") &&  name1.equals("Euro")){
            rez = name2 * 0.94;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Dollars")  &&  name1.equals("Hryvnia")){
            rez = name2 * 0.027;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Euro")  &&  name1.equals("Rubles")){
            rez = name2 * 102;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Euro")  &&  name1.equals("Dollars")){
            rez = name2 * 1.05;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Euro")  &&  name1.equals("Hryvnia")){
            rez = name2 * 38.33;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Hryvnia")  &&  name1.equals("Rubles")){
            rez = name2 * 2.68;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Hryvnia")  &&  name1.equals("Dollars")){
            rez = name2 * 0.027;
            model.addAttribute("name", rez);
        }
        else if (name.equals("Hryvnia")  &&  name1.equals("Euro")){
            rez = name2 * 0.026;
            model.addAttribute("name", rez);
        }

        return "valut";
    }
    @GetMapping("/rezult")
    String rezult() {
        return "rezult";
    }

    @GetMapping("/calc")
    String calc() {
        return "calc";
    }

    @GetMapping("/valut")
    String valut() {
        return "valut";
    }

}
