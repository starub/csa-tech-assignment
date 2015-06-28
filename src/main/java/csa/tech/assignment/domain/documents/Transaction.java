package csa.tech.assignment.domain.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import csa.tech.assignment.domain.documents.types.TransactionType;

@Document
public class Transaction {

    @Id
    private String id;

    private String customerId;

    private TransactionType type;

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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
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
        result = prime * result + ((created == null) ? 0 : created.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Transaction other = (Transaction) obj;
        if (created == null) {
            if (other.created != null) return false;
        } else if (!created.equals(other.created)) return false;
        if (customerId == null) {
            if (other.customerId != null) return false;
        } else if (!customerId.equals(other.customerId)) return false;
        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        if (type != other.type) return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Transaction [id=%s, customerId=%s, type=%s, created=%s]", id, customerId, type, created);
    }

}
