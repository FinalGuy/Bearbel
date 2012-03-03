package de.tfojuth.projects.teamworker.blgexport.model;

import java.util.List;

public interface AssignmentDao {

    Assignment create();

    Assignment findById();

    List<Assignment> findAll();

    Assignment update(Assignment assignment);

    Assignment delete(Assignment assignment);

}
