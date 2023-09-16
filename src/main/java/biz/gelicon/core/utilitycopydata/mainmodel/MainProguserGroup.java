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
    private Integer ProguserGroupId;
    @Size(max = 255)
    @Column(name = "ProguserGroup_Note", nullable = true)
    private String ProguserGroupNote;
    @Size(max = 30)
    @Column(name = "ProguserGroup_Name", nullable = false)
    private String ProguserGroupName;

    @Column(name = "ProguserGroup_Visible", nullable = false)
    private Integer ProguserGroupVisible;

    public MainProguserGroup() {

    }

    public Integer getProguserGroupId() {
        return ProguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        ProguserGroupId = proguserGroupId;
    }

    public String getProguserGroupNote() {
        return ProguserGroupNote;
    }

    public void setProguserGroupNote(String proguserGroupNote) {
        ProguserGroupNote = proguserGroupNote;
    }

    public String getProguserGroupName() {
        return ProguserGroupName;
    }

    public void setProguserGroupName(String proguserGroupName) {
        ProguserGroupName = proguserGroupName;
    }

    public Integer getProguserGroupVisible() {
        return ProguserGroupVisible;
    }

    public void setProguserGroupVisible(Integer proguserGroupVisible) {
        ProguserGroupVisible = proguserGroupVisible;
    }

    public MainProguserGroup(Integer proguserGroupId, String proguserGroupNote, String proguserGroupName, Integer proguserGroupVisible) {
        ProguserGroupId = proguserGroupId;
        ProguserGroupNote = proguserGroupNote;
        ProguserGroupName = proguserGroupName;
        ProguserGroupVisible = proguserGroupVisible;
    }
}
