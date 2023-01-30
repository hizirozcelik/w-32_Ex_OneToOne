package ca.sheridancollege.ozcelikh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.ozcelikh.beans.Guest;
import ca.sheridancollege.ozcelikh.beans.Pet;
import ca.sheridancollege.ozcelikh.repository.GuestRepository;
import ca.sheridancollege.ozcelikh.repository.PetRepository;

@Controller
public class HomeController {

    private GuestRepository guestRepo;
    private PetRepository petRepo;

    public HomeController(GuestRepository guestRepo, PetRepository petRepo) {
        super();
        this.guestRepo = guestRepo;
        this.petRepo = petRepo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("guests", guestRepo.findAll());
        return "index";
    }

    @GetMapping("/addGuest")
    public String addGuest(Model model) {

        model.addAttribute("guest", new Guest());
        return "addGuest";
    }

    @GetMapping("/addedGuest")
    public String addGuest(
    		@RequestParam String name, 
    		@RequestParam int age, 
    		@RequestParam String petName,
            @RequestParam String petKind) {
        if (petName != "" && petKind != "") {
            Pet pet = Pet.builder().name(petName).kind(petKind).build();
            petRepo.save(pet);
            Guest guest = Guest.builder().name(name).age(age).pet(pet).build();
            guestRepo.save(guest);
        } else {
            Guest guest = Guest.builder().name(name).age(age).build();
            guestRepo.save(guest);
        }

        return "redirect:/addGuest";
    }

}
