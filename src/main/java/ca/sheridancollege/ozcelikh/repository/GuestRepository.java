package ca.sheridancollege.ozcelikh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.ozcelikh.beans.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long>{

}
