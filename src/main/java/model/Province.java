package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers;
    public Province() {
    }
}
