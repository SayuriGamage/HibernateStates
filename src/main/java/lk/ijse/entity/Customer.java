package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    //generate for order
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String Address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Customer(String id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    public Customer() {
    }


}
