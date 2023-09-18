package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ProguserGroup")
public class MainProguserGroup {
    @Id
    @Column(name = "ProguserGroup_Id", nullable = false)
    private Integer proguserGroupId;

    @Size(max = 30)
    @Column(name = "ProguserGroup_Name", nullable = false)
    private String proguserGroupName;
    @Size(max = 255)
    @Column(name = "ProguserGroup_Note", nullable = true)
    private String proguserGroupNote;


    @Column(name = "ProguserGroup_Visible", nullable = false)
    private Integer proguserGroupVisible;



    public Integer getProguserGroupId() {
        return proguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        this.proguserGroupId = proguserGroupId;
    }

    public String getProguserGroupNote() {
        return proguserGroupNote;
    }

    public void setProguserGroupNote(String proguserGroupNote) {
        this.proguserGroupNote = proguserGroupNote;
    }

    public String getProguserGroupName() {
        return proguserGroupName;
    }

    public void setProguserGroupName(String proguserGroupName) {
        this.proguserGroupName = proguserGroupName;
    }

    public Integer getProguserGroupVisible() {
        return proguserGroupVisible;
    }

    public void setProguserGroupVisible(Integer proguserGroupVisible) {
        this.proguserGroupVisible = proguserGroupVisible;
    }

    public MainProguserGroup(Integer proguserGroupId, String proguserGroupNote, String proguserGroupName, Integer proguserGroupVisible) {
        this.proguserGroupId = proguserGroupId;
        this.proguserGroupNote = proguserGroupNote;
        this.proguserGroupName = proguserGroupName;
        this.proguserGroupVisible = proguserGroupVisible;
    }
    public MainProguserGroup() {

    }
}
