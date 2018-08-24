package com.mongo.MongoSpringBootCrud.controller;

import com.mongo.MongoSpringBootCrud.model.Person;
import com.mongo.MongoSpringBootCrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/create")
    public String addPerson(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
        Person p = personService.create(firstName,lastName,age);
        return p.toString();
    }

    @RequestMapping("/get")
    public Person getPerson(@RequestParam String firstName){

        return personService.getByFirstName(firstName);
    }

    @RequestMapping("/getAll")
    public List<Person> getAll(){

        return personService.getAll();
    }

    @RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age){
        Person p = personService.update(firstName, lastName, age);
        return p.toString();
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String firstName){
        personService.delete(firstName);
        return "deleted "+firstName;
    }

    @RequestMapping("/deleteAll")
    public String deleteAll(){
        personService.deleteAll();
        return "deleted All Records ";
    }
}
