package br.com.theLoanBook.Libary_labschcool.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//Deve conter as seguintes regras:
//
//Client:
//- deve fazer a validação do cpf(quantidade de caractéres, se é válido)
//- Só pode ser adicionado um cliente para o mesmo cpf
//
//Loan:
//- O pagamento do empréstimo só pode ser efetuado se o cartão selecionado possuir crédito.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String cpf;

    @JsonManagedReference
    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Card> cards;



}
