package org.solon.app.domain;

import lombok.Data;
import org.solon.app.entity.ParentEntity;

import java.util.List;

@Data
public class ChildDomain {

    private Long id;
    private String childValue;
    private List<ParentEntity> parents;

}
