/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.service;

import br.com.lduran.entity.Todo;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

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

    public Todo updateTodo(Long id, Todo todo)
    {
        /*
        ✔ Se a entidade já foi buscada → NÃO use merge
        ✔ Apenas altere os atributos
        ✔ O JPA faz o UPDATE automaticamente no commit da transação
        */
        Todo entity = findToDoById(id);

        entity.setTask(todo.getTask());
        entity.setDueDate(todo.getDueDate());
        entity.setCompleted(todo.isCompleted());
        entity.setDateCreated(todo.getDateCreated());
        entity.setDateComplited(todo.getDateComplited());

        return entity;
    }

    public Todo findToDoById(Long id)
    {
        return Optional
            .ofNullable(entityManager.find(Todo.class, id))
            .orElseThrow(() ->
                new NotFoundException("No records found for this ID!")
            );
    }

    public List<Todo> getTodos()
    {
        return entityManager.createQuery("SELECT t from Todo t", Todo.class).getResultList();
    }
}
