package com.fetchsalary.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taxinformation")
public class Tax {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "taxid")
	private int taxid;
	@Column(name = "taxableincome")
	private double taxableincome;

	public Tax(int taxid, double taxableincome) {
		super();
		this.taxid = taxid;
		this.taxableincome = taxableincome;
	}

	@Override
	public String toString() {
		return "Tax [taxid=" + taxid + ", taxableincome=" + taxableincome + "]";
	}

	public int getTaxid() {
		return taxid;
	}

	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}

	public double getTaxableincome() {
		return taxableincome;
	}

	public void setTaxableincome(double taxableincome) {
		this.taxableincome = taxableincome;
	}
}
