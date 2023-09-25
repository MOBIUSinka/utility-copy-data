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
    private Integer worker_id;

    @Size(max = 10)
    @Column(name = "errortransittype_id", nullable = false)
    private Integer errortransittype_id;
    @Size(max = 10)
    @Column(name = "project_id", nullable = true)
    private Integer project_id;
    @Size(max = 10)
    @Column(name = "application_id", nullable = true)
    private Integer application_id;
    @Size(max = 10)
    @Column(name = "projectaccount_id", nullable = true)
    private Integer projectaccount_id;
    @Size(max = 10)
    @Column(name = "projectaccountingwork_id", nullable = true)
    private Integer projectaccountingwork_id;
    @Size(max = 10)
    @Column(name = "department_id", nullable = true)
    private Integer department_id;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(Integer worker_id) {
        this.worker_id = worker_id;
    }

    public Integer getErrortransittype_id() {
        return errortransittype_id;
    }

    public void setErrortransittype_id(Integer errortransittype_id) {
        this.errortransittype_id = errortransittype_id;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public Integer getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Integer application_id) {
        this.application_id = application_id;
    }

    public Integer getProjectaccount_id() {
        return projectaccount_id;
    }

    public void setProjectaccount_id(Integer projectaccount_id) {
        this.projectaccount_id = projectaccount_id;
    }

    public Integer getProjectaccountingwork_id() {
        return projectaccountingwork_id;
    }

    public void setProjectaccountingwork_id(Integer projectaccountingwork_id) {
        this.projectaccountingwork_id = projectaccountingwork_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public Manager(Integer managerId, Integer worker_id, Integer errortransittype_id, Integer project_id, Integer application_id, Integer projectaccount_id, Integer projectaccountingwork_id, Integer department_id) {
        this.managerId = managerId;
        this.worker_id = worker_id;
        this.errortransittype_id = errortransittype_id;
        this.project_id = project_id;
        this.application_id = application_id;
        this.projectaccount_id = projectaccount_id;
        this.projectaccountingwork_id = projectaccountingwork_id;
        this.department_id = department_id;
    }

    public Manager() {
    }
}
