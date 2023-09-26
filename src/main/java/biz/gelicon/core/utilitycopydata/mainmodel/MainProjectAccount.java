package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "projectaccount")
public class MainProjectAccount {
    @Id
    @Column(name = "projectaccount_id", nullable = false)
    private Integer projectaccountid;

    @Column(name = "client_id", nullable = false)
    private Integer clientid;

    @Column(name = "projectaccounttype_id", nullable = false)
    private Integer projectaccounttypeId;

    @Size(max = 50)
    @Column(name = "projectaccount_name", nullable = false)
    private String projectaccountName;

    @Column(name = "projectaccount_status", nullable = false)
    private Integer projectaccountStatus;

    @Column(name = "projectaccount_report_id", nullable = true)
    private Integer projectaccountreportId;
    @Column(name = "projectaccount_code", nullable = true)
    private String projectaccountCode;
    @Column(name = "worker_id", nullable = true)
    private Integer workerId;

    public Integer getProjectaccountid() {
        return projectaccountid;
    }

    public void setProjectaccountid(Integer projectaccountid) {
        this.projectaccountid = projectaccountid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getProjectaccounttypeId() {
        return projectaccounttypeId;
    }

    public void setProjectaccounttypeId(Integer projectaccounttypeId) {
        this.projectaccounttypeId = projectaccounttypeId;
    }

    public String getProjectaccountName() {
        return projectaccountName;
    }

    public void setProjectaccountName(String projectaccountName) {
        this.projectaccountName = projectaccountName;
    }

    public Integer getProjectaccountStatus() {
        return projectaccountStatus;
    }

    public void setProjectaccountStatus(Integer projectaccountStatus) {
        this.projectaccountStatus = projectaccountStatus;
    }

    public Integer getProjectaccountreportId() {
        return projectaccountreportId;
    }

    public void setProjectaccountreportId(Integer projectaccountreportId) {
        this.projectaccountreportId = projectaccountreportId;
    }

    public String getProjectaccountCode() {
        return projectaccountCode;
    }

    public void setProjectaccountCode(String projectaccountCode) {
        this.projectaccountCode = projectaccountCode;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public MainProjectAccount(Integer projectaccountid, Integer clientid, Integer projectaccounttypeId, String projectaccountName, Integer projectaccountStatus, Integer projectaccountreportId, String projectaccountCode, Integer workerId) {
        this.projectaccountid = projectaccountid;
        this.clientid = clientid;
        this.projectaccounttypeId = projectaccounttypeId;
        this.projectaccountName = projectaccountName;
        this.projectaccountStatus = projectaccountStatus;
        this.projectaccountreportId = projectaccountreportId;
        this.projectaccountCode = projectaccountCode;
        this.workerId = workerId;
    }

    public MainProjectAccount() {
    }
}
