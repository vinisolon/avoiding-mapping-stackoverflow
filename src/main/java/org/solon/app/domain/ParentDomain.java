package org.solon.app.domain;

import lombok.Data;
import org.solon.app.entity.ChildEntity;

@Data
public class ParentDomain {

    private Long id;
    private String parentValue;
    private ChildEntity child;

}
