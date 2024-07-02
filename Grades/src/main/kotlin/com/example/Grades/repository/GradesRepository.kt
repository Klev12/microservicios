package com.example.Grades.repository

import com.example.Grades.entity.GradesEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.swing.text.html.parser.Entity

@Repository
interface GradesRepository : JpaRepository<GradesEntity, Long?> {

}
