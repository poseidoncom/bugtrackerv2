package com.wolffdev.bugtrackerv2.domain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BugRepository extends CrudRepository <Bug, Long> {
}
