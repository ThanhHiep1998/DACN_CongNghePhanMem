package com.cnpm.model;
// Generated Aug 15, 2020 10:23:04 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Booking generated by hbm2java
 */
@Entity
@Table(name = "booking", catalog = "onlinehotel")
public class Booking implements java.io.Serializable {

	private Integer id;
	private Room room;
	private String customerName;
	private String customerEmail;
	private String cusomerAddress;
	private String customerPhone;
	private Date createDate;
	private String status;
	private Date checkIn;
	private Date checkOut;
	private int unitPrice;
	private int total;

	public Booking() {
	}

	public Booking(Room room, String customerName, String customerEmail, String cusomerAddress, String customerPhone,
			Date createDate, String status, Date checkIn, Date checkOut, int unitPrice, int total) {
		this.room = room;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cusomerAddress = cusomerAddress;
		this.customerPhone = customerPhone;
		this.createDate = createDate;
		this.status = status;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.unitPrice = unitPrice;
		this.total = total;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id", nullable = false)
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Column(name = "customer_name", nullable = false, length = 45)
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "customer_email", nullable = false, length = 45)
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Column(name = "cusomer_address", nullable = false, length = 45)
	public String getCusomerAddress() {
		return this.cusomerAddress;
	}

	public void setCusomerAddress(String cusomerAddress) {
		this.cusomerAddress = cusomerAddress;
	}

	@Column(name = "customer_phone", nullable = false, length = 45)
	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "check-in", nullable = false, length = 10)
	public Date getCheckIn() {
		return this.checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "check-out", nullable = false, length = 10)
	public Date getCheckOut() {
		return this.checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	@Column(name = "unit_price", nullable = false)
	public int getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "total", nullable = false)
	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
