package com.example.demojpatransaction.mapper;

import java.util.List;

public interface ObjectMapper<E, D> {
    D toDto(E e);
    E toEntity(D d);

    List<D> toDtoList(List<E> e);
    List<E> toEntityList(List<D> e);
}
