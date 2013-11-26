package org.example;
 
import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name="PHONE_NUMBER")
public class PhoneNumber implements Serializable {
    private static final long serialVersionUID = 1L;
 
    @Id
    private long id;
     
    private String num;
     
    private String type;
 
    @ManyToOne
    @JoinColumn(name="ID_CUSTOMER")
    private Customer customer;
 
    public long getId() {
        return this.id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getNum() {
        return this.num;
    }
 
    public void setNum(String num) {
        this.num = num;
    }
 
    public String getType() {
        return this.type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public Customer getCustomer() {
        return this.customer;
    }
 
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
     
}
