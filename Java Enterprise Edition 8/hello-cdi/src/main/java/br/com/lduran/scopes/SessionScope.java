/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.scopes;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author lsdur
 */

@SessionScoped
public class SessionScope implements Serializable {
    private static final long serialVersionUID = 440804699990999L;

    public String getHashCode() {
        return this.hashCode() + " ";
    }
}