package com.umcs.skni.mordappka.termGroup;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TermGroupDTO {
    private Long id;
    private String majorName;

    public static TermGroupDTO toDTO(TermGroup termGroup) {
        return TermGroupDTO.builder()
                .id(termGroup.getTermGroupId())
                .majorName(termGroup.getMajor().getMajorName())
                .build();
    }

}
