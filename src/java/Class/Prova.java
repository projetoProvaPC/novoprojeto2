/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Thais
 */

@Entity
@Table
public class Prova {
    
  
    List<Questao> questoes = new ArrayList<>();
}
