package ca.sheridancollege.ozcelikh.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.ozcelikh.beans.Guest;
import ca.sheridancollege.ozcelikh.beans.Pet;
import ca.sheridancollege.ozcelikh.repository.GuestRepository;
import ca.sheridancollege.ozcelikh.repository.PetRepository;

@Component
public class GuestPetData implements CommandLineRunner{

    private GuestRepository guestRepo;
    private PetRepository petRepo;

    public GuestPetData(GuestRepository guestRepo, PetRepository petRepo) {
        super();
        this.guestRepo = guestRepo;
        this.petRepo = petRepo;
    }

    @Override
    public void run(String... args) throws Exception {


        Pet pet1 = Pet.builder().name("Rex").kind("Dog").build();
        Pet pet2 = Pet.builder().name("Milo").kind("Cat").build();
        Pet pet3 = Pet.builder().name("Buddy").kind("Bird").build();
        Pet pet4 = Pet.builder().name("Mia").kind("Cat").build();
        Pet pet5 = Pet.builder().name("Dex").kind("Dog").build();
        Pet pet6 = Pet.builder().name("Care").kind("Cat").build();
        Pet pet7 = Pet.builder().name("Toto").kind("Bird").build();
        Pet pet8 = Pet.builder().name("Koko").kind("Cat").build();

        petRepo.save(pet1);
        petRepo.save(pet2);
        petRepo.save(pet3);
        petRepo.save(pet4);
        petRepo.save(pet5);
        petRepo.save(pet6);
        petRepo.save(pet7);
        petRepo.save(pet8);
        
        Guest guest1 = Guest.builder().name("John").age(25).pet(pet1).build();
        Guest guest2 = Guest.builder().name("Jane").age(30).pet(pet2).build();
        Guest guest3 = Guest.builder().name("Jack").age(35).build();
        Guest guest4 = Guest.builder().name("Jill").age(40).pet(pet4).build();
        Guest guest5 = Guest.builder().name("Hizir").age(45).pet(pet5).build();
        Guest guest6 = Guest.builder().name("Hulya").age(50).pet(pet6).build();
        Guest guest7 = Guest.builder().name("Erdo").age(55).pet(pet7).build();
        Guest guest8 = Guest.builder().name("Cano").age(60).pet(pet8).build();
        Guest guest9 = Guest.builder().name("Kate").age(65).build();
        Guest guest10 = Guest.builder().name("Jenny").age(70).pet(pet3).build();

        guestRepo.save(guest1);
        guestRepo.save(guest2);
        guestRepo.save(guest3);
        guestRepo.save(guest4);
        guestRepo.save(guest5);
        guestRepo.save(guest6);
        guestRepo.save(guest7);
        guestRepo.save(guest8);
        guestRepo.save(guest9);
        guestRepo.save(guest10);


    }

}
