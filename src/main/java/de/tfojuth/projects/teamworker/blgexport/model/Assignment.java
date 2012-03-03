package de.tfojuth.projects.teamworker.blgexport.model;


import java.util.Date;

public class Assignment {

    private int costCenter;
    /* change data type*/
    private String qualification;
    private Date beginDate;
    private Date endDate;
    /* "Programm" */
    private String department;


    public int getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(int costCenter) {
        this.costCenter = costCenter;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
