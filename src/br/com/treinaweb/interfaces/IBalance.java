package br.com.treinaweb.interfaces;

public interface IBalance {
    //  by feault methods in interface are public.
    void withdraw(double value);
    void deposit(double value);
}