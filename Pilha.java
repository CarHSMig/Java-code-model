import java.util.Scanner;

public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[10];
    }

    public boolean pilhaVazia() {
        return this.posicaoPilha == -1;
    }

    public int tamanho() {
        return this.pilhaVazia() ? 0 : this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        return this.pilhaVazia() ? null : this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        return this.pilhaVazia() ? null : this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite o número correspondente a função que deseja aplicar:");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Exibir Topo");
            System.out.println("4 - Listar Elementos");
            System.out.println("5 - Sair");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.print("Digite o valor a ser empilhado: ");
                    Object valorEmpilhar = scanner.nextLine();
                    pilha.empilhar(valorEmpilhar);
                    System.out.println("Elemento empilhado com sucesso.");
                    break;
                case "2":
                    Object valorDesempilhado = pilha.desempilhar();
                    if (valorDesempilhado != null) {
                        System.out.println("Elemento desempilhado: " + valorDesempilhado);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case "3":
                    Object topo = pilha.exibeUltimoValor();
                    if (topo != null) {
                        System.out.println("Topo da pilha: " + topo);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case "4":
                    int tamanho = pilha.tamanho();
                    if (tamanho > 0) {
                        System.out.println("Elementos na pilha:");
                        for (int i = tamanho - 1; i >= 0; i--) {
                            System.out.println(pilha.pilha[i]);
                        }
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case "5":
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}
