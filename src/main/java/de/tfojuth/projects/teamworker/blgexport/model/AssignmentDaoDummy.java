package de.tfojuth.projects.teamworker.blgexport.model;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

public class AssignmentDaoDummy implements AssignmentDao {
    @Override
    public Assignment create() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Assignment findById() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Assignment> findAll() {
        Assignment assignment = new Assignment();
        assignment.setCostCenter(1234);
        assignment.setDepartment("Abteilung B");
        assignment.setBeginDate(Date.valueOf("2012-01-01"));
        assignment.setEndDate(Date.valueOf("2012-01-31"));
        return Collections.singletonList(assignment);
    }

    @Override
    public Assignment update(Assignment assignment) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Assignment delete(Assignment assignment) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
