package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "project_id", nullable = false)
    private Integer projectId;

    @Column(name = "project_code", nullable = true)
    private String projectCode;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "project_status", nullable = false)
    private Integer projectStatus;

    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "worker_id", nullable = true)
    private Integer workerId;

    @Column(name = "project_notmodel", nullable = false)
    private Integer projectNotmodel;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getProjectNotmodel() {
        return projectNotmodel;
    }

    public void setProjectNotmodel(Integer projectNotmodel) {
        this.projectNotmodel = projectNotmodel;
    }

    public Project() {

    }

    public Project(
            Integer projectId,
            String projectCode,
            String projectName,
            Integer projectStatus,
            Integer departmentId,
            Integer workerId,
            Integer projectNotmodel
    ) {
        this.projectId = projectId;
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.projectStatus = projectStatus;
        this.departmentId = departmentId;
        this.workerId = workerId;
        this.projectNotmodel = projectNotmodel;
    }
}
