package com.example.paco.retrofeet_proof.api;

/**
 * Created by paco on 31/10/2016.
 */
public class Repository {
    private String id;
    private String name;

    @Override
    public String toString() {
        return id + "/" + name;
    }
}
