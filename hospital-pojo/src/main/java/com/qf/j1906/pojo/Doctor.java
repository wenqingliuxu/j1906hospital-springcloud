package com.qf.j1906.pojo;

public class Doctor {
    private Integer doctorId;

    private String doName;

    private String gender;

    private String depId;

    private Integer doStatus;

    private String telphone;

    private String images;

    private String doInfo;

    private String pwd;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoName() {
        return doName;
    }

    public void setDoName(String doName) {
        this.doName = doName == null ? null : doName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    public Integer getDoStatus() {
        return doStatus;
    }

    public void setDoStatus(Integer doStatus) {
        this.doStatus = doStatus;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getDoInfo() {
        return doInfo;
    }

    public void setDoInfo(String doInfo) {
        this.doInfo = doInfo == null ? null : doInfo.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doName='" + doName + '\'' +
                ", gender='" + gender + '\'' +
                ", depId='" + depId + '\'' +
                ", doStatus=" + doStatus +
                ", telphone='" + telphone + '\'' +
                ", images='" + images + '\'' +
                ", doInfo='" + doInfo + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}