package org.solon.app.rest;

import lombok.RequiredArgsConstructor;
import org.solon.app.entity.ChildEntity;
import org.solon.app.entity.ParentEntity;
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

    @GetMapping("/parents")
    public @ResponseBody List<ParentEntity> getParents() {
        return parentRepository.findAll();
    }

    @GetMapping("/children")
    public @ResponseBody List<ChildEntity> getChildren() {
        return childRepository.findAll();
    }

}
