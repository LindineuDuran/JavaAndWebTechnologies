/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.scopes;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author lsdur
 */
@RequestScoped
public class RequestScope
{

    public String getHashCode()
    {
        return this.hashCode() + " ";
    }
}
