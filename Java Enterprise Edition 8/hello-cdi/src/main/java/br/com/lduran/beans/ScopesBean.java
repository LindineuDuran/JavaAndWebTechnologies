/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.beans;

import br.com.lduran.scopes.DependentScope;
import br.com.lduran.scopes.RequestScope;
import br.com.lduran.scopes.SessionScope;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author lsdur
 */
public class ScopesBean implements Serializable
{
    // Field injection point
    @Inject
    private RequestScope requestScope;

    private DependentScope dependentScope;

    private SessionScope sessionScope;

    // Constructor injection point
    @Inject
    private ScopesBean(DependentScope dependentScope)
    {
        this.dependentScope = dependentScope;
    }

    //Method injection point
    @Inject
    private void setSessionScope(SessionScope sessionScope)
    {
        this.sessionScope = sessionScope;
    }
}
