**Atividade Prática POO**




### <a name="_sjczwzxl0eyk"></a>**Exercício 1: Classes Básicas e Objetos**
#### <a name="_moc5k953quu3"></a>**Parte 1: Criação de Classes e Objetos**
1. Fácil: Crie uma classe Livro com os seguintes atributos:
    1. titulo (String)
    1. autor (String)
    1. anoPublicacao (int)
1. Médio: Adicione métodos na classe Livro:
    1. Um método exibirDetalhes() que imprime os detalhes do livro.
1. Difícil: Crie uma classe Biblioteca que armazena uma lista de livros e possui métodos para adicionar e listar os livros.
    1. Use um ArrayList<Livro> para armazenar os livros.
    1. Método adicionarLivro(Livro livro) para adicionar um livro à biblioteca.
    1. Método listarLivros() para listar todos os livros da biblioteca.
### <a name="_7l764jj5nm9w"></a>**Exercício 2: Encapsulamento e Métodos**
#### <a name="_u7lzjsw8lg3"></a>**Parte 2: Encapsulamento**
1. Fácil: Modifique a classe Livro para que seus atributos sejam privados e forneça métodos getter e setter para cada um deles.
1. Médio: Adicione validação nos setters, por exemplo, anoPublicacao não pode ser negativo.
1. Difícil: Na classe Biblioteca, crie um método buscarLivroPorTitulo(String titulo) que retorna o livro com o título especificado.
###
###
### <a name="_xborr4riw529"></a><a name="_2bbsszao3t95"></a><a name="_wbwvto58hng7"></a>**Exercício 3: Herança e Polimorfismo**
#### <a name="_enz7yoyp9ibx"></a>**Parte 3: Herança**
1. Fácil: Crie uma classe Revista que herda da classe Livro e adicione um atributo edicao (int).
1. Médio: Sobrescreva o método exibirDetalhes() na classe Revista para incluir a edição da revista.
1. Difícil: Modifique a classe Biblioteca para que ela possa armazenar tanto livros quanto revistas. Utilize polimorfismo para listar os detalhes de cada item corretamente.
### <a name="_wet7zxjcdcz"></a>**Exercício 4: Interfaces e Classes Abstratas**
#### <a name="_dj7pku2pv7ec"></a>**Parte 4: Interfaces e Classes Abstratas**
1. Fácil: Crie uma interface ItemBiblioteca com o método exibirDetalhes().
1. Médio: Faça com que Livro e Revista implementem a interface ItemBiblioteca.
1. Difícil: Crie uma classe abstrata Item que implemente ItemBiblioteca e faça com que Livro e Revista herdem de Item. Adicione um método abstrato getTipo() na classe Item que retorna o tipo de item (livro ou revista).

