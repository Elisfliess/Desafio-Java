package br.com.totvs.juridico;

import dto.LivroDTO;
import java.util.ArrayList;

public class LivrariaApplication {
    ArrayList<LivroDTO> listLivros= new ArrayList<>();
    public static void main(String[] args){
        new LivrariaApplication();
    }

    public LivrariaApplication(){
        this.initLivros();
        this.criarUmNovoLivro("Arquitetura Limpa", "Tecnologia");
        this.criarUmNovoLivro("Harry Potter e a Camara secreta", "Fantasia");
        this.criarUmNovoLivro("WildCards", "Esportes");
        this.criarUmNovoLivro("O Trono do Sol", "Fantasia");
        System.out.println(this.listarLivrosFantasia());
    }

    public void initLivros(){
        this.listLivros.add(new LivroDTO( 0,  "Código Limpo", "Tecnologia"));
        this.listLivros.add(new LivroDTO( 1,  "Senhor do Anéis",  "Fantasia" ));
        this.listLivros.add(new LivroDTO( 2,  "WildCards", "Fantasia" ));
        this.listLivros.add(new LivroDTO( 3,  "Harry Potter e o Prisioneiro de Azkaban", "Fantasia" ));
        this.listLivros.add(new LivroDTO( 4,  "Javascript de alto desempenho", "Tecnologia" ));
        this.listLivros.add(new LivroDTO( 5,  "O poder da ação", "Administração" ));
    }

    public void criarUmNovoLivro(String nome, String genero){
        if (buscarLivro(nome, genero) == 0){
            LivroDTO novoLivro = new LivroDTO(this.listLivros.size(), nome, genero);
            this.listLivros.add(novoLivro);
        } else {
            System.out.println("o livro " + nome + genero + " já está cadastrado");



            /**
             * Monte a mensagem de erro avisando que já existe um Livro cadastrado sobre o nome e genero passados
             */

            // Adicionei o else para poder imprimir o livro que a funcao chamou já esta cadastrado.
            // Basicamente Utilizei o System.out.println(); para imprimir o que foi pedido, entre " " está o
            // que eu quero que apareça na tela, mas como é um aviso de que tal livro já está cadastrado
            // eu adicionei no código as variaveis Nome e Idade para o print imprimir na tela ambas informações.



        }
    }

    public int buscarLivro(String nomeLivro, String genero){
        int indiceLivro = -1;

        for (int index = 0 ; index < this.listLivros.size(); index++){
            LivroDTO livro = this.listLivros.get(index);
                if (livro.nome.equals(nomeLivro) && livro.genero.equals(genero
                )) {
                System.out.println("livro" + livro.nome + "e" + livro.genero + "esta na posicao" + listLivros);

            }
            return index;
            if (this.listLivros,buscarLivro(nomeLivro && genero);
                System.out.println("achou");
        }

        // tentei selecionar livro.nome e livro.genero para poder puxar os nomes deles e imprimir na tela, o if seria
        // para dizer que precisa buscar o livro e o genero e depois ler todos os livros para mostar apenas o que esta
        // com o mesmo nome e genero.

            /**
             * Implemente a validação onde retorne o Indice do Livro caso encontre um com mesmo nome e genero
             */
        }
        return indiceLivro;
    }

    public String listarLivrosFantasia(){
        return null;



        // seria imprimir somente os livros de fantasia mas poderia usar verdadeiro e falso para passar por todos
        // os livros e mostrar somente os de fantasia.


        /**
         * Retorne uma String contendo todos os Livros que são de fantasia.
         */
    }
}