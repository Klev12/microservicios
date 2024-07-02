package com.example.Students.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentsController {

    @GetMapping
    fun list():String{
        return "estudiantes"
    }
}