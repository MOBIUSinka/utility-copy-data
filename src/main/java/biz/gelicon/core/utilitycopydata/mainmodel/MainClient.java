package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "client")
public class MainClient {
    @Id
    @Column(name = "client_id", nullable = false)
    private Integer clientId;

    @Size(max = 10)
    @Column(name = "client_code", nullable = true)
    private String clientCode;
    @Size(max = 50)
    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Size(max = 10)
    @Column(name = "client_status", nullable = false)
    private Integer clientStatus;

    @Size(max = 10)
    @Column(name = "client_report_id", nullable = true)
    private Integer clientReportId;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    public Integer getClientReportId() {
        return clientReportId;
    }

    public void setClientReportId(Integer clientReportId) {
        this.clientReportId = clientReportId;
    }

    public MainClient() {
    }
}
