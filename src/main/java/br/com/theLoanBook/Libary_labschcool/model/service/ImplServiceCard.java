package br.com.theLoanBook.Libary_labschcool.model.service;

import br.com.theLoanBook.Libary_labschcool.model.entity.Card;
import br.com.theLoanBook.Libary_labschcool.model.repository.RepositoryCard;
import br.com.theLoanBook.Libary_labschcool.model.service.interfaces.ServiceCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
 public class ImplServiceCard implements ServiceCard {
    @Autowired
    private RepositoryCard repositoryCard;

    @Override
    public Card salvar(Card card) {
        return this.repositoryCard.save(card);
    }

    @Override
    public Card atualizar(Card object) {
        return null;
    }


    @Override
    public Card buscar(Long id) {
        return this.repositoryCard.findById(id).orElseThrow(() -> {
            throw  new EntityNotFoundException("Sorry no found card " + id);
        });
    }

    @Override
    public List listar() {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
