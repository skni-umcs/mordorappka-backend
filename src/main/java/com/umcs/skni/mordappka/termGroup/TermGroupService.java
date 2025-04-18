package com.umcs.skni.mordappka.termGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TermGroupService {
    private final TermGroupRepository termGroupRepository;
    private final TermGroupMapper termGroupMapper;

    List<TermGroupDTO> findAll() {
        var termGroups = (List<TermGroup>) termGroupRepository.findAll();
        return termGroups.stream().map(termGroupMapper::toDTO).collect(Collectors.toList());
    }
    List<TermGroupDTO> findActive() {
        var termGroups = (List<TermGroup>) termGroupRepository.findAll();

        Long currentPeriod = termGroups.stream()
                .map(tg -> tg.getPeriod().getPeriodId())
                .max(Long::compare)
                .orElse(null);
        termGroups = termGroups.stream()
                .filter(termGroup -> Objects.equals(termGroup.getPeriod().getPeriodId(), currentPeriod))
                .toList();
        return termGroups.stream().map(termGroupMapper::toDTO).collect(Collectors.toList());
    }

}
