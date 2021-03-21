package com.store.converter;

import java.util.List;
import java.util.Set;

public interface IConverter<S, T> {
    T convert(S s);
    S convertReverse(T t);
    List<T> convertAll(List<S> s);
    Set<T> convertSet(Set<S> s);
    Set<S> convertSetReverse(Set<T> t);
}
