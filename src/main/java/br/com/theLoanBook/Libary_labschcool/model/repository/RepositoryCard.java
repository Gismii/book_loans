package br.com.theLoanBook.Libary_labschcool.model.repository;

import br.com.theLoanBook.Libary_labschcool.model.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCard extends JpaRepository<Card, Long> {



}
