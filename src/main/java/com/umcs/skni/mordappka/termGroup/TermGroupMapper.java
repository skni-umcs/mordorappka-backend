package com.umcs.skni.mordappka.termGroup;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TermGroupMapper {
    TermGroupDTO toDTO(TermGroup termGroup);
    TermGroup toEntity(TermGroupDTO termGroupDTO);
}
