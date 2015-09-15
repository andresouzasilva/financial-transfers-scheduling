package br.tur.reservafacil.fts.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FTS {

    public enum Type { A, B, C, D};

    @NotEmpty(message="field \"to\" cannot be empty")
    private String to;

    @NotEmpty(message="field \"from\" cannot be empty")
    private String from;

    @NotNull(message="field \"value\" cannot be empty")
    private BigDecimal value;

    private BigDecimal tax;

    @NotNull(message="field \"type\" cannot be empty")
    private Type type;

    @JsonFormat(pattern="dd/MM/yyyy")
    @NotNull(message="field \"schedulingDate\" cannot be empty")
    private Date schedulingDate;

    public FTS() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getSchedulingDate() {
        return schedulingDate;
    }

    public void setSchedulingDate(Date schedulingDate) {
        this.schedulingDate = schedulingDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
