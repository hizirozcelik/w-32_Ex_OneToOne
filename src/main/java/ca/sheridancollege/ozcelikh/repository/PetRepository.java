package ca.sheridancollege.ozcelikh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.ozcelikh.beans.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
