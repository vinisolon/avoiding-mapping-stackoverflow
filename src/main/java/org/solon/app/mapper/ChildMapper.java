package org.solon.app.mapper;

import org.mapstruct.Mapper;
import org.solon.app.domain.ChildDomain;
import org.solon.app.entity.ChildEntity;

@Mapper(componentModel = "spring", uses = ParentMapper.class)
public interface ChildMapper {

    ChildDomain from(ChildEntity entity);

}
