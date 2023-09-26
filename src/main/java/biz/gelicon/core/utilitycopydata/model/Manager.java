package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "manager")
public class Manager {
    @Id
    @Column(name = "manager_id", nullable = false)
    private Integer managerId;

    @Size(max = 10)
    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    @Size(max = 10)
    @Column(name = "errortransittype_id", nullable = false)
    private Integer errortransittypeId;
    @Size(max = 10)
    @Column(name = "project_id", nullable = true)
    private Integer projectId;
    @Size(max = 10)
    @Column(name = "application_id", nullable = true)
    private Integer applicationId;
    @Size(max = 10)
    @Column(name = "projectaccount_id", nullable = true)
    private Integer projectaccountId;
    @Size(max = 10)
    @Column(name = "projectaccountingwork_id", nullable = true)
    private Integer projectaccountingworkId;
    @Size(max = 10)
    @Column(name = "department_id", nullable = true)
    private Integer departmentId;


    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getErrortransittypeId() {
        return errortransittypeId;
    }

    public void setErrortransittypeId(Integer errortransittypeId) {
        this.errortransittypeId = errortransittypeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getProjectaccountId() {
        return projectaccountId;
    }

    public void setProjectaccountId(Integer projectaccountId) {
        this.projectaccountId = projectaccountId;
    }

    public Integer getProjectaccountingworkId() {
        return projectaccountingworkId;
    }

    public void setProjectaccountingworkId(Integer projectaccountingworkId) {
        this.projectaccountingworkId = projectaccountingworkId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Manager(Integer managerId, Integer workerId, Integer errortransittypeId, Integer projectId, Integer applicationId, Integer projectaccountId, Integer projectaccountingworkId, Integer departmentId) {
        this.managerId = managerId;
        this.workerId = workerId;
        this.errortransittypeId = errortransittypeId;
        this.projectId = projectId;
        this.applicationId = applicationId;
        this.projectaccountId = projectaccountId;
        this.projectaccountingworkId = projectaccountingworkId;
        this.departmentId = departmentId;
    }

    public Manager() {
    }
}
