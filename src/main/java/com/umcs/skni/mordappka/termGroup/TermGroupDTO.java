package com.umcs.skni.mordappka.termGroup;

public record TermGroupDTO(
        Long termGroupId,
        String majorName,
        String year,
        String period,
        boolean winterTerm){}
