/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lduran.beans;

import br.com.lduran.scopes.RequestScope;
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
}
