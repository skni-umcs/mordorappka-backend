package com.umcs.skni.mordappka.termGroup;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TermGroupMapper {
    @Mapping(source = "major.majorName", target = "majorName")
    @Mapping(source = "period.academicYear", target = "period")
    @Mapping(source = "period.winterTerm", target = "winterTerm")
    TermGroupDTO toDTO(TermGroup termGroup);
}
