/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.scopes;

import java.io.Serializable;

/**
 *
 * @author lsdur
 */
public class DependentScope implements Serializable
{
    public String getHashCode()
    {
        return this.hashCode() + " ";
    }
}
