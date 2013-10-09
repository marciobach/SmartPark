package exemploHIbernate;


import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Teste {
    @Id @GeneratedValue(strategy=AUTO) 
    private Integer id; 
    
    private String nome;
    public Integer getId() { 
        return id; 
    } 
    public String getNome() { 
        return nome; 
    } 
    public void setId(Integer id) { 
        this.id = id; 
    } 
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
}