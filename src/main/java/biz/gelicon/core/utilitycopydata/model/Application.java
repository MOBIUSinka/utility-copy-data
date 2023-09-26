package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "application_id", nullable = false)
    private Integer applicationId;

    @Size(max = 10)
    @Column(name = "application_type", nullable = false)
    private Integer applicationType;

    @Size(max = 50)
    @Column(name = "application_code", nullable = true)
    private String applicationCode;
    @Size(max = 50)
    @Column(name = "application_name", nullable = false)
    private String applicationName;
    @Size(max = 50)
    @Column(name = "application_exe", nullable = false)
    private String applicationExe;

    @Column(name = "application_blob", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] applicationBlob;

    @Size(max = 10)
    @Column(name = "application_status", nullable = false)
    private Integer applicationStatus;

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationExe() {
        return applicationExe;
    }

    public void setApplicationExe(String applicationExe) {
        this.applicationExe = applicationExe;
    }

    public byte[] getApplicationBlob() {
        return applicationBlob;
    }

    public void setApplicationBlob(byte[] applicationBlob) {
        this.applicationBlob = applicationBlob;
    }

    public Integer getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Application(Integer applicationId, Integer applicationType, String applicationCode, String applicationName, String applicationExe, byte[] applicationBlob, Integer applicationStatus) {
        this.applicationId = applicationId;
        this.applicationType = applicationType;
        this.applicationCode = applicationCode;
        this.applicationName = applicationName;
        this.applicationExe = applicationExe;
        this.applicationBlob = applicationBlob;
        this.applicationStatus = applicationStatus;
    }

    public Application() {
    }
}
