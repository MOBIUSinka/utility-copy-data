package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CapCodeType")
public class CapCodeType {
    @Id
    @Column(name = "CapCodeType_Id", nullable = false)
    public Integer CapCodeTypeId;

    @Column(name = "CapCodeType_Code", nullable = false)
    public String CapCodeTypeCode;

@Column(name = "CapCodeType_Name", nullable = false)
    public String CapCodeTypeName;

@Column(name = "CapCodeType_Text", nullable = true)
public Byte CapCodeTypeText;
}
