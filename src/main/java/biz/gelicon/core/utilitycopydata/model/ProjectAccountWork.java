package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "projectaccountwork")
public class ProjectAccountWork {
    @Id
    @Column(name = "projectaccountingwork_id", nullable = false)
    private Integer projectaccountingworkId;

    @Column(name = "projectaccount_id", nullable = true)
    private Integer projectaccountId;

    @Size(max = 128)
    @Column(name = "projectaccountwork_name", nullable = false)
    private String projectaccountworkName;
    @Column(name = "projectaccountwork_status", nullable = false)
    private Integer projectaccountworkStatus;
    @Column(name = "projectaccountwork_report_id", nullable = true)
    private Integer projectaccountworkReportId;

    public Integer getProjectaccountingworkId() {
        return projectaccountingworkId;
    }

    public void setProjectaccountingworkId(Integer projectaccountingworkId) {
        this.projectaccountingworkId = projectaccountingworkId;
    }

    public Integer getProjectaccountId() {
        return projectaccountId;
    }

    public void setProjectaccountId(Integer projectaccountId) {
        this.projectaccountId = projectaccountId;
    }

    public String getProjectaccountworkName() {
        return projectaccountworkName;
    }

    public void setProjectaccountworkName(String projectaccountworkName) {
        this.projectaccountworkName = projectaccountworkName;
    }

    public Integer getProjectaccountworkStatus() {
        return projectaccountworkStatus;
    }

    public void setProjectaccountworkStatus(Integer projectaccountworkStatus) {
        this.projectaccountworkStatus = projectaccountworkStatus;
    }

    public Integer getProjectaccountworkReportId() {
        return projectaccountworkReportId;
    }

    public void setProjectaccountworkReportId(Integer projectaccountworkReportId) {
        this.projectaccountworkReportId = projectaccountworkReportId;
    }

    public ProjectAccountWork(Integer projectaccountingworkId, Integer projectaccountId, String projectaccountworkName, Integer projectaccountworkStatus, Integer projectaccountworkReportId) {
        this.projectaccountingworkId = projectaccountingworkId;
        this.projectaccountId = projectaccountId;
        this.projectaccountworkName = projectaccountworkName;
        this.projectaccountworkStatus = projectaccountworkStatus;
        this.projectaccountworkReportId = projectaccountworkReportId;
    }

    public ProjectAccountWork() {
    }
}

