public class Pessoa {

    //atributos privados
    private String nome;
    private int idade;
    
    //construtor personalizado *permite inicializar os atributos ao criar um objeto da classe.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //métodos getters e setters *para acesso e modificação dos atributos (caso necessário) quando forem privados. 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Meu nome é " + nome + " e tenho " + idade;
    }

    //método *para exibir a mensagem com o nome e a idade.
    public void saudacao () {
        System.out.println("Me chamo " + nome + " tenho " + idade + " e estou a procura da primeira oportunidade na área de TI");
    }
}