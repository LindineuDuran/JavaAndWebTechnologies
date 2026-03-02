/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.service;

import br.com.lduran.entity.Todo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author lsdur
 */
@Transactional
public class TodoService
{

    @PersistenceContext
    EntityManager entityManager;

    public Todo createTodo(Todo todo)
    {
        // Persist into db
        entityManager.persist(todo);

        return todo;
    }

    public Todo updateTodo(Todo todo)
    {
        // Persist into db
        entityManager.merge(todo);

        return todo;
    }

    public Todo findToDoById(Long id)
    {
        return entityManager.find(Todo.class, id);
    }

}
