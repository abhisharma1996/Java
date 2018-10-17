package com.capgemini.bank.bean;

public class DemandDraft {
	int transaction_id,dd_amount,dd_commission;
	String customer_name,in_favor_of,date_of_transaction,dd_description;
	String phone_number;
	public DemandDraft() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemandDraft(int transaction_id, int dd_amount, int dd_commission,
			String customer_name, String in_favor_of,
			String date_of_transaction, String dd_description,
			String phone_number) {
		super();
		this.transaction_id = transaction_id;
		this.dd_amount = dd_amount;
		this.dd_commission = dd_commission;
		this.customer_name = customer_name;
		this.in_favor_of = in_favor_of;
		this.date_of_transaction = date_of_transaction;
		this.dd_description = dd_description;
		this.phone_number = phone_number;
	}
	public DemandDraft(int dd_amount, String customer_name, String in_favor_of,
			String dd_description, String phone_number) {
		super();
		this.dd_amount = dd_amount;
		this.customer_name = customer_name;
		this.in_favor_of = in_favor_of;
		this.dd_description = dd_description;
		this.phone_number = phone_number;
	}
	public DemandDraft(int transaction_id, int dd_amount,
			String customer_name, String in_favor_of,
			String date_of_transaction, String dd_description, String phone_number) {
		super();
		this.transaction_id = transaction_id;
		this.dd_amount = dd_amount;
		this.customer_name = customer_name;
		this.in_favor_of = in_favor_of;
		this.date_of_transaction = date_of_transaction;
		this.dd_description = dd_description;
		this.phone_number = phone_number;
		if(dd_amount<=5000)
			this.dd_commission=10;
		else if(dd_amount>5000 && dd_amount<=10000)
			this.dd_commission=41;
		else if(dd_amount>10000 && dd_amount<=100000)
			this.dd_commission=51;
		else
			this.dd_commission=306;
	}

	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getDd_amount() {
		return dd_amount;
	}
	public void setDd_amount(int dd_amount) {
		this.dd_amount = dd_amount;
	}
	public int getDd_commission() {
		return dd_commission;
	}
	public void setDd_commission(int dd_commission) {
		this.dd_commission = dd_commission;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getIn_favor_of() {
		return in_favor_of;
	}
	public void setIn_favor_of(String in_favor_of) {
		this.in_favor_of = in_favor_of;
	}
	public String getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(String date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public String getDd_description() {
		return dd_description;
	}
	public void setDd_description(String dd_description) {
		this.dd_description = dd_description;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "DemandDraft [transaction_id=" + transaction_id + ", dd_amount="
				+ dd_amount + ", dd_commission=" + dd_commission
				+ ", customer_name=" + customer_name + ", in_favor_of="
				+ in_favor_of + ", date_of_transaction=" + date_of_transaction
				+ ", dd_description=" + dd_description + ", phone_number="
				+ phone_number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime
				* result
				+ ((date_of_transaction == null) ? 0 : date_of_transaction
						.hashCode());
		result = prime * result + dd_amount;
		result = prime * result + dd_commission;
		result = prime * result
				+ ((dd_description == null) ? 0 : dd_description.hashCode());
		result = prime * result
				+ ((in_favor_of == null) ? 0 : in_favor_of.hashCode());
		result = prime * result
				+ ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + transaction_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemandDraft other = (DemandDraft) obj;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (date_of_transaction == null) {
			if (other.date_of_transaction != null)
				return false;
		} else if (!date_of_transaction.equals(other.date_of_transaction))
			return false;
		if (dd_amount != other.dd_amount)
			return false;
		if (dd_commission != other.dd_commission)
			return false;
		if (dd_description == null) {
			if (other.dd_description != null)
				return false;
		} else if (!dd_description.equals(other.dd_description))
			return false;
		if (in_favor_of == null) {
			if (other.in_favor_of != null)
				return false;
		} else if (!in_favor_of.equals(other.in_favor_of))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (transaction_id != other.transaction_id)
			return false;
		return true;
	}



}
