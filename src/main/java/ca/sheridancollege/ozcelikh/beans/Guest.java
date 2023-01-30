package ca.sheridancollege.ozcelikh.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Guest {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    @OneToOne
    @JoinTable(name = "guest_pet"
            , joinColumns = @JoinColumn(name = "guest_id")
            , inverseJoinColumns = @JoinColumn(name = "pet_id"))
    private Pet pet;



}
