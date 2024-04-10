package com.example.springbacth.entity;import jakarta.persistence.*;import lombok.*;import java.sql.Time;import java.sql.Timestamp;@Entity@Table(name = "Customer_info")public class Customer {    @Id    @Column(name = "customer_id")    private Long id;    @Column(name = "first_name")    private String firstName;    @Column(name = "last_name")    private String lastName;    @Column(name = "email")    private String email;    @Column(name = "gender")    private String gender;    @Column(name = "contact")    private String contactNo;    @Column(name = "country")    private String country;    @Column(name = "dob")    private Timestamp dob;    public Customer() {    }    /**     * get field @Id     @Column(name = "customer_id")      *      * @return id @Id     @Column(name = "customer_id")     */    public Long getId() {        return this.id;    }    /**     * set field @Id     @Column(name = "customer_id")      *      * @param id @Id     @Column(name = "customer_id")     */    public void setId(Long id) {        this.id = id;    }    /**     * get field @Column(name = "first_name")     *     * @return firstName @Column(name = "first_name")     */    public String getFirstName() {        return this.firstName;    }    /**     * set field @Column(name = "first_name")     *     * @param firstName @Column(name = "first_name")     */    public void setFirstName(String firstName) {        this.firstName = firstName;    }    /**     * get field @Column(name = "last_name")     *     * @return lastName @Column(name = "last_name")     */    public String getLastName() {        return this.lastName;    }    /**     * set field @Column(name = "last_name")     *     * @param lastName @Column(name = "last_name")     */    public void setLastName(String lastName) {        this.lastName = lastName;    }    /**     * get field @Column(name = "email")     *     * @return email @Column(name = "email")     */    public String getEmail() {        return this.email;    }    /**     * set field @Column(name = "email")     *     * @param email @Column(name = "email")     */    public void setEmail(String email) {        this.email = email;    }    /**     * get field @Column(name = "gender")     *     * @return gender @Column(name = "gender")     */    public String getGender() {        return this.gender;    }    /**     * set field @Column(name = "gender")     *     * @param gender @Column(name = "gender")     */    public void setGender(String gender) {        this.gender = gender;    }    /**     * get field @Column(name = "contact")     *     * @return contactNo @Column(name = "contact")     */    public String getContactNo() {        return this.contactNo;    }    /**     * set field @Column(name = "contact")     *     * @param contactNo @Column(name = "contact")     */    public void setContactNo(String contactNo) {        this.contactNo = contactNo;    }    /**     * get field @Column(name = "country")     *     * @return country @Column(name = "country")     */    public String getCountry() {        return this.country;    }    /**     * set field @Column(name = "country")     *     * @param country @Column(name = "country")     */    public void setCountry(String country) {        this.country = country;    }    /**     * get field @Column(name = "dob")     *     * @return dob @Column(name = "dob")     */    public Timestamp getDob() {        return this.dob;    }    /**     * set field @Column(name = "dob")     *     * @param dob @Column(name = "dob")     */    public void setDob(Timestamp dob) {        this.dob = dob;    }}