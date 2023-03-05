package com.carbooking.model;



public class RegisterDto {

    private long id;
    private String username;

    private String password;

    private CustomerDto customerDto;

    private DriverDto driverDto;

    private String userType;

    public String getUserType() {

        return userType;

    }
    public void setUserType(String userType) {

        this.userType = userType;

    }
    public CustomerDto getCustomerDto() {

        return customerDto;
    }
    public void setCustomerDto(CustomerDto customerDto) {

        this.customerDto = customerDto;
    }
    public DriverDto getDriverDto() {

        return driverDto;
    }
    public void setDriverDto(DriverDto driverDto) {

        this.driverDto = driverDto;
    }
    public long getId() {

        return id;
    }
    public void setId(long id) {

        this.id = id;
    }
    public String getUsername() {

        return username;
    }
    public void setUsername(String username) {

        this.username = username;
    }
    public String getPassword() {

        return password;
    }
    public void setPassword(String password) {

        this.password = password;
    }
}

