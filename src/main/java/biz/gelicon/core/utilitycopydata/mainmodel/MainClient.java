package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Client")
public class MainClient {
        @Id
        @Column(name = "Client_Id", nullable = false)
        private Integer ClientId;

        @Size(max = 10)
        @Column(name = "Client_Code", nullable = true)
        private String ClientCode;
        @Size(max = 50)
        @Column(name = "Client_Name", nullable = false)
        private String ClientName;

        @Size(max = 10)
        @Column(name = "Client_Status", nullable = false)
        private Integer ClientStatus;

        @Size(max = 10)
        @Column(name = "Client_Report_Id", nullable = true)
        private Integer ClientReportId;

    public Integer getClientId() {
        return ClientId;
    }

    public void setClientId(Integer clientId) {
        ClientId = clientId;
    }

    public String getClientCode() {
        return ClientCode;
    }

    public void setClientCode(String clientCode) {
        ClientCode = clientCode;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public Integer getClientStatus() {
        return ClientStatus;
    }

    public void setClientStatus(Integer clientStatus) {
        ClientStatus = clientStatus;
    }

    public Integer getClientReportId() {
        return ClientReportId;
    }

    public void setClientReportId(Integer clientReportId) {
        ClientReportId = clientReportId;
    }

    public MainClient(Integer clientId, String clientCode, String clientName, Integer clientStatus, Integer clientReportId) {
        ClientId = clientId;
        ClientCode = clientCode;
        ClientName = clientName;
        ClientStatus = clientStatus;
        ClientReportId = clientReportId;
    }

    public MainClient() {
    }
}
