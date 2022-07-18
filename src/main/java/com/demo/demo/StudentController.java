package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // This method GET HTTP method
    //Access via localhost http:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ephraim","Aloaye");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
     List<Student> students = new ArrayList<>();

        students.add(new Student("Jamal", "Brooks"));
        students.add(new Student("Ruth", "John"));
        students.add(new Student("Samuel", "Kilo"));
        students.add(new Student("Ben", "10"));
        return students;
    }
    //Access via localhost http:8080/student/ruth/john/
    //@PathVariable :To bind the request URL template path variable to the method variable.
    @GetMapping("/students/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }


    //Build a rest API to handle query parameters
    //Example: http://localhost:8080/student/query?firstName=ruth
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
                                     @RequestParam(name="lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
