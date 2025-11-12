package org.solon.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.solon.app.domain.ParentDomain;
import org.solon.app.entity.ParentEntity;

@Mapper(componentModel = "spring")
public interface ParentMapper {

    @Mapping(target = "child.parents", ignore = true)
    ParentDomain from(ParentEntity entity);

    @Named("mapIgnoringChild")
    @Mapping(target = "child", ignore = true)
    ParentDomain mapIgnoringChild(ParentEntity entity);

}
