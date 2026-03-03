/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author lsdur
 */
@Data
@Entity
public class Todo implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotEmpty(message = "Task must be set!")
    @Size(min = 10, message = "Task should not be less than 10 characters!")
    private String task;
    
    @NotNull(message = "Due must be set!")
    @FutureOrPresent(message = "Due must be in the present or in the future")
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private LocalDate dueDate;
    
    private boolean isCompleted;
    private LocalDate dateCreated;
    private LocalDate dateComplited;

    @PrePersist
    private void init()
    {
        setDateCreated(LocalDate.now());
    }
}
