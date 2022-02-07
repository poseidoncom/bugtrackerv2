package com.wolffdev.bugtrackerv2.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BugRepository extends CrudRepository <Bug, Long> {

    List<Bug> findByCriticality(@Param("criticality") int criticality);

    // Fetch cars by color
    List<Bug> findByDescription(@Param("description") String description);
}
