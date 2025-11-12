package org.solon.app.rest;

import lombok.RequiredArgsConstructor;
import org.solon.app.domain.ChildDomain;
import org.solon.app.domain.ParentDomain;
import org.solon.app.mapper.ChildMapper;
import org.solon.app.mapper.ParentMapper;
import org.solon.app.repository.ChildRepository;
import org.solon.app.repository.ParentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/family")
@RequiredArgsConstructor
public class FamilyController {

    private final ParentRepository parentRepository;
    private final ChildRepository childRepository;
    private final ParentMapper parentMapper;
    private final ChildMapper childMapper;

    @GetMapping("/parents")
    public @ResponseBody List<ParentDomain> getParents() {
        return parentRepository.findAll()
                .stream()
                .map(parentMapper::from)
                .toList();
    }

    @GetMapping("/children")
    public @ResponseBody List<ChildDomain> getChildren() {
        return childRepository.findAll()
                .stream()
                .map(childMapper::from)
                .toList();
    }

}
