package org.solon.app.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChildDomain {

    private Long id;
    private String childValue;
    private List<ParentDomain> parents = new ArrayList<>();

}
