package org.solon.app.repository;

import org.solon.app.entity.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<ChildEntity, Long> {
}
