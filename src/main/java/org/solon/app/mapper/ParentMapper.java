package org.solon.app.mapper;

import org.mapstruct.Mapper;
import org.solon.app.domain.ParentDomain;
import org.solon.app.entity.ParentEntity;

@Mapper(componentModel = "spring", uses = ChildMapper.class)
public interface ParentMapper {

    ParentDomain from(ParentEntity entity);

    ParentEntity from(ParentDomain domain);

}
