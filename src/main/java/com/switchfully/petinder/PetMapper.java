package com.switchfully.petinder;

import java.util.List;
import java.util.stream.Collectors;

public class PetMapper {
    private Pet pet;
    private PetDTO petDTO;

    public List<PetDTO> toPetDTO(List<Pet> petList) {
        return petList.stream().map(this::toPetDTO).collect(Collectors.toList());
    }

    public PetDTO toPetDTO(Pet pet){
        return new PetDTO(pet.getId(), pet.getName(), pet.getKind(), pet.getProfileString());
    }

    public List<Pet> toPet(List<PetDTO> petDTOList) {
        return petDTOList.stream().map(this::toPet).collect(Collectors.toList());
    }

    public Pet toPet(PetDTO petDTO){
        return new Pet(pet.getId(), pet.getName(), pet.getKind(), pet.getProfileString());
    }
}
