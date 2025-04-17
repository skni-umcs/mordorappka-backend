package com.umcs.skni.mordappka.termGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
