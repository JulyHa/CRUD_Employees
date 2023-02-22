package com.employee.model;

public class EmployeeModel {
    private Long id;
    private String name;
    private String address;
    private BranchModel branchModel;

    public EmployeeModel() {
    }

    public EmployeeModel(Long id, String name, String address, BranchModel branchModel) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.branchModel = branchModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BranchModel getBranchModel() {
        return branchModel;
    }

    public void setBranchModel(BranchModel branchModel) {
        this.branchModel = branchModel;
    }
}
