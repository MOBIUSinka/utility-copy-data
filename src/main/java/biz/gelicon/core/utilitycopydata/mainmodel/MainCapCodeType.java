package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CapCodeType")
public class MainCapCodeType {
    @Id
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

    public MainCapCodeType() {

    }

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

    public MainCapCodeType(Integer capCodeTypeId, String capCodeTypeCode, String capCodeTypeName, byte[] capCodeTypeText) {
        CapCodeTypeId = capCodeTypeId;
        CapCodeTypeCode = capCodeTypeCode;
        CapCodeTypeName = capCodeTypeName;
        CapCodeTypeText = capCodeTypeText;
    }
}