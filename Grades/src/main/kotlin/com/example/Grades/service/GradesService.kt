package com.example.Grades.service

import com.example.Grades.entity.GradesEntity
import com.example.Grades.repository.GradesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class GradesService {
    @Autowired
    lateinit var gradesRepository: GradesRepository

    fun list ():List<GradesEntity>{
        return gradesRepository.findAll()
    }
    fun save(gradesEntity: GradesEntity): GradesEntity{
        try{
            return gradesRepository.save(gradesEntity)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

}