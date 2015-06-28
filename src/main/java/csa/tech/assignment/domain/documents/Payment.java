package csa.tech.assignment.domain.documents;

import java.util.Date;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import csa.tech.assignment.domain.documents.types.PaymentType;

@Document
public class Payment {

    @Id
    private String id;

    private String customerId;

    private String transactionId;

    private PaymentType type;

    private Money amount;

    private CurrencyUnit currency;

    private String description;

    private Date created;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((created == null) ? 0 : created.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Payment other = (Payment) obj;
        if (amount == null) {
            if (other.amount != null) return false;
        } else if (!amount.equals(other.amount)) return false;
        if (created == null) {
            if (other.created != null) return false;
        } else if (!created.equals(other.created)) return false;
        if (currency == null) {
            if (other.currency != null) return false;
        } else if (!currency.equals(other.currency)) return false;
        if (customerId == null) {
            if (other.customerId != null) return false;
        } else if (!customerId.equals(other.customerId)) return false;
        if (description == null) {
            if (other.description != null) return false;
        } else if (!description.equals(other.description)) return false;
        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        if (transactionId == null) {
            if (other.transactionId != null) return false;
        } else if (!transactionId.equals(other.transactionId)) return false;
        if (type != other.type) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Payment [id=%s, customerId=%s, transactionId=%s, type=%s, amount=%s, currency=%s, description=%s, created=%s]",
                id, customerId, transactionId, type, amount, currency, description, created);
    }
    
}
