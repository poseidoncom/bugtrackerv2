package com.wolffdev.bugtrackerv2.web;

import com.wolffdev.bugtrackerv2.domain.Bug;
import com.wolffdev.bugtrackerv2.domain.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
    @Autowired
    private BugRepository repository;

    @RequestMapping("/bugs")
    public Iterable<Bug> getBugs(){
        return repository.findAll();
    }
}
