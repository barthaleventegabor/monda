package com.example.models;

import java.util.ArrayList;
import java.util.List;

public interface Accessible<T> {
    public List<T> index();
    public void store(T emp);
    public void update(T emp, int id);
    public void destroy(int id);
}
