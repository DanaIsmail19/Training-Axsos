package com.dandon.projectManger.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dandon.projectManger.models.Project;
import com.dandon.projectManger.models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findAll();
    List<Project> findByTeamMembersNotContains(User user);
    List<Project> findByTeamMembersContains(User user);
}
