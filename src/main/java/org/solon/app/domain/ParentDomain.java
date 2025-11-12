package org.solon.app.domain;

import lombok.Data;

@Data
public class ParentDomain {

    private Long id;
    private String parentValue;
    private ChildDomain child;

}
