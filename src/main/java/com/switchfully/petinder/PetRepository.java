package com.switchfully.petinder;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {
    public List<Pet> getAllPets() {
        Pet dog = new Pet(1, "Tobias", Kind.DOG, "Waf Waf");
        Pet cat = new Pet(2, "Mario", Kind.CAT, "Miau");
        Pet chicken = new Pet(3, "Liza", Kind.CHICKEN, "Cocorococo");

        return List.of(dog, cat, chicken);
    }
}
