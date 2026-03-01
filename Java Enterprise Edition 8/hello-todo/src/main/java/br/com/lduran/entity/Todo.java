/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import lombok.Data;

/**
 *
 * @author lsdur
 */
@Data
@Entity
public class Todo {
    private Long id;
    private String task;
    private LocalDate dueDate;
    private boolean isCompleted;
    private LocalDate dateCreated;
    private LocalDate dateComplited;
    
    @PrePersist
    private void init(){
        setDateCreated(LocalDate.now());
    }
}
