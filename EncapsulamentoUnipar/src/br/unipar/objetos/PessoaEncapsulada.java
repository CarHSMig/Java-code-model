package br.unipar.objetos;

public class PessoaEncapsulada {
    //1° passo - Atributos privados
    private String nome;
    private String time;

    //Getter vai ser para retornar o valor
    //Sempre vai ser public ou protect


    public String getNome() {
        return nome;
    }

    public String getTime() {
        return time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
