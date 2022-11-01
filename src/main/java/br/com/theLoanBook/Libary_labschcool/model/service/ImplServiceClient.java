package br.com.theLoanBook.Libary_labschcool.model.service;

import br.com.theLoanBook.Libary_labschcool.model.entity.Client;
import br.com.theLoanBook.Libary_labschcool.model.repository.RepositoryClient;
import br.com.theLoanBook.Libary_labschcool.model.service.interfaces.ServiceClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplServiceClient implements ServiceClient {
    @Autowired
    private RepositoryClient repositoryClient;


    @Override
    public Client salvar(Client client) {
        return (Client) this.repositoryClient.save(client);
    }

    @Override
    public Client atualizar(Client client) {
        Client searchClient = this.buscar(client.getId());

        BeanUtils.copyProperties(client, searchClient, "id");

        return (Client) this.repositoryClient.save(searchClient);


    }

    @Override
    public Client buscar(Long id) {
        return null;
    }

    @Override
    public List<Client> listar() {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
