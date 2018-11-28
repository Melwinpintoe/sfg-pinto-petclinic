package guru.springframework.sfgpintopetclinic.services;

import guru.springframework.sfgpintopetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
