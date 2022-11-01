package br.com.theLoanBook.Libary_labschcool.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Card {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotNull
  private String number;


  private Double limit;

  private Double currentLimit;

  @ManyToOne
  @JoinColumn(name = "client_id")
  @JsonBackReference
  private Client client;
}
