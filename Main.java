import java.util.Scanner;

public class Main {
    public static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public double getPreco(){
            
            return preco;
        }
        
        public void setPreco(double preco){
            
            this.preco = preco;
        }

        public int getQuantidade(){
            
            return quantidade;
        }

        public double valorTotal(){
            
            return preco * quantidade;
        }

        public void adicionarProdutos(int quantidade){
            
            this.quantidade += quantidade;
        }

        public void removerProdutos(int quantidade){
            
            if (quantidade <= this.quantidade){
                this.quantidade -= quantidade;
                
            } else {
                
                System.out.println("Quantidade insuficiente no estoque!");
            }
        }
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = lerDoubleValido(sc);

        System.out.println("Digite a quantidade do produto:");
        int quantidade = lerIntValido(sc);

        Produto produto1 = new Produto(nome, preco, quantidade);

        int resposta;
        do {
            System.out.printf("O nome do produto é: %s\nO preço do produto é: %.2f\nA quantidade do produto é: %d\nO valor total é: %.2f\n",
                    produto1.getNome(), produto1.getPreco(), produto1.getQuantidade(), produto1.valorTotal());

            System.out.println("Deseja realizar alguma atualização?\n1- Sim\n2- Não");
            resposta = lerIntValido(sc);

            if (resposta == 1) {
                
                System.out.println("1- Adicionar produto\n2- Remover produto\n3- Alterar nome do produto\n4- Alterar o valor do produto\n");
                int resposta1 = lerIntValido(sc);

                if (resposta1 == 1) {
                    
                    System.out.println("Quantos produtos deseja adicionar?");
                    int quantidadeAdicionar = lerIntValido(sc);
                    produto1.adicionarProdutos(quantidadeAdicionar);

                } else if (resposta1 == 2) {
                    
                    System.out.println("Quantos produtos deseja remover?");
                    int quantidadeRemover = lerIntValido(sc);
                    produto1.removerProdutos(quantidadeRemover);
                    
                } else if (resposta1 == 3){
                    
                    sc.nextLine(); 
                    System.out.println("Digite o novo nome do produto:");
                    String novoNome = sc.nextLine();
                    produto1.setNome(novoNome);
                    System.out.printf("Nome atualizado: %s\n", produto1.getNome());
                    
                } else if (resposta1 == 4){
                    
                    System.out.println("Digite o novo valor do produto");
                    double novoPreco = lerDoubleValido(sc);
                    produto1.setPreco(novoPreco);
                    System.out.printf("Preço atualizado: %s\n", produto1.getPreco());
                    
                } else {
                    
                    System.out.println("Opção inválida.");
                }
                
            } else {
                
                System.out.println("Ok. Muito obrigado.");
            }
            
        } while (resposta == 1);

        System.out.println("Fim do programa");
        sc.close();
    }

    private static double lerDoubleValido(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida! Por favor, insira um número válido.");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static int lerIntValido(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro válido.");
            sc.next();
        }
        return sc.nextInt();
    }
}