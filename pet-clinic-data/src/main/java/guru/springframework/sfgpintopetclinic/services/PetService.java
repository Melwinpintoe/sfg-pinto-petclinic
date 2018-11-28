package guru.springframework.sfgpintopetclinic.services;

import guru.springframework.sfgpintopetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
