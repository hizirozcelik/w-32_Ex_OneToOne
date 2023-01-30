package ca.sheridancollege.ozcelikh.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Pet {



    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String kind;

    @Transient
    public static String[] species = {"Dog", "Cat", "Bird"};

}
