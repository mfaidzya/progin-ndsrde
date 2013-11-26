package org.example;
 
import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;
 
@Entity
@NamedQuery(name = "findCustomersByCity",
            query = "SELECT c " +
                    "FROM Customer c " +
                    "WHERE c.address.city = :city")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
 
    @Id
    private long id;
 
    @Column(name="FIRST_NAME")
    private String firstName;
 
    @Column(name="LAST_NAME")
    private String lastName;
 
    @OneToOne(mappedBy="customer", cascade={CascadeType.ALL})
    private Address address;
 
    @OneToMany(mappedBy="customer", cascade={CascadeType.ALL})
    private Set<phonenumber> phoneNumbers;
 
    public long getId() {
        return this.id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return this.firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return this.lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public Address getAddress() {
        return this.address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
     
    public Set<PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }
 
    public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
     
}
