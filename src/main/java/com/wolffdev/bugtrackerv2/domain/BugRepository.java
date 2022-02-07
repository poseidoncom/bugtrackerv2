package com.wolffdev.bugtrackerv2.domain;
import org.springframework.data.repository.CrudRepository;


public interface BugRepository extends CrudRepository <Bug, Long> {
}
