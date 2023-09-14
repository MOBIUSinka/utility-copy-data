package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "CapCodeType")
public class CapCodeType {
    @Id
    @Size(max = 10)
    @Column(name = "CapCodeType_Id", nullable = false)
    private Integer CapCodeTypeId;
    @Size(max = 10)
    @Column(name = "CapCodeType_Code", nullable = false)
    private String CapCodeTypeCode;
    @Size(max = 50)
    @Column(name = "CapCodeType_Name", nullable = false)
    private String CapCodeTypeName;

    @Column(name = "CapCodeType_Text", nullable = true, columnDefinition = "LONGBLOB")
    private byte[] CapCodeTypeText;

    public Integer getCapCodeTypeId() {
        return CapCodeTypeId;
    }

    public void setCapCodeTypeId(Integer capCodeTypeId) {
        CapCodeTypeId = capCodeTypeId;
    }

    public String getCapCodeTypeCode() {
        return CapCodeTypeCode;
    }

    public void setCapCodeTypeCode(String capCodeTypeCode) {
        CapCodeTypeCode = capCodeTypeCode;
    }

    public String getCapCodeTypeName() {
        return CapCodeTypeName;
    }

    public void setCapCodeTypeName(String capCodeTypeName) {
        CapCodeTypeName = capCodeTypeName;
    }

    public byte[] getCapCodeTypeText() {
        return CapCodeTypeText;
    }

    public void setCapCodeTypeText(byte[] capCodeTypeText) {
        CapCodeTypeText = capCodeTypeText;
    }

    public CapCodeType(Integer CapCodeTypeId, String CapCodeTypeCode, String CapCodeTypeName, byte[] CapCodeTypeText) {
        this.CapCodeTypeId = CapCodeTypeId;
        this.CapCodeTypeCode = CapCodeTypeCode;
        this.CapCodeTypeName = CapCodeTypeName;
        this.CapCodeTypeText = CapCodeTypeText;
    }
}
