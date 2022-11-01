package br.com.theLoanBook.Libary_labschcool.model.entity;

import lombok.Getter;

@Getter
public enum TypeCard {

    DEBITO("Debito"),
    CREDITO("Credito");

    private String typeCard;

    private TypeCard(String debito) {
        this.typeCard = typeCard;

    }
}
