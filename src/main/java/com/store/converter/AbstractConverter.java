package com.store.converter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractConverter<S, T> implements IConverter<S, T> {

    @Override
    public List<T> convertAll(List<S> s) {
        List<T> result = new ArrayList<>();
        for (S s1: s){
            T convert = convert(s1);
            result.add(convert);
        }
        return result;
    }

    @Override
    public Set<T> convertSet(Set<S> s) {
        Set<T> result = new HashSet<>();
        for (S s1: s){
            T convert = convert(s1);
            result.add(convert);
        }
        return result;
    }

    @Override
    public Set<S> convertSetReverse(Set<T> t) {
        Set<S> result = new HashSet<>();
        for (T s1: t){
            S convert = convertReverse(s1);
            result.add(convert);
        }
        return result;
    }
}
