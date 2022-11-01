package br.com.theLoanBook.Libary_labschcool.model.service.interfaces;

import java.util.List;

public interface DefaultCrud <T> {
    T salvar (T object);
    T atualizar (T obeact );
    T buscar( Long id );
    List<T> listar();

    void deletar(Long id);
}
