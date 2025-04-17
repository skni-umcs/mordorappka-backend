package com.umcs.skni.mordappka.termGroup;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermGroupRepository  extends CrudRepository<TermGroup, Long> {
}
