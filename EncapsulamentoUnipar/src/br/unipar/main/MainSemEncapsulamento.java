package br.unipar.main;

import br.unipar.objetos.PessoaSemEncapsulamento;

public class MainSemEncapsulamento {

    public static void main(String[] args) {

        PessoaSemEncapsulamento pessoa = new
                PessoaSemEncapsulamento();
        pessoa.nome = "Carlos";
        pessoa.time = "Hepta Gaucho";
    }

}
