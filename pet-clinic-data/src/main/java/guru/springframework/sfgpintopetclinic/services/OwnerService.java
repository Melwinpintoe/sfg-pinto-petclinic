package guru.springframework.sfgpintopetclinic.services;

import guru.springframework.sfgpintopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

     Owner findByLastName(String lastName);
}
