import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        /*intância da classe Pessoa com os parâmetros já inicializados onde a variável pessoa(que é o objeto da classe Pessoa),
        recebe a classe Pessoa e acesso o método.*/
        Pessoa pessoa = new Pessoa("João VItor", 32);
        pessoa.saudacao();
        System.out.println("************************");

        //lista do tipo Pessoa(que é uma classe e retorna ela mesma), e recebe uma coleção sem parâmentros.
        List<Pessoa> irmaos = new ArrayList<>();
        irmaos.add(new Pessoa("João Vitor", 32));
        irmaos.add(new Pessoa("João Manoel", 34));
        irmaos.add(new Pessoa("João Pedro", 26));

        //forEach do tipo Pessoa onde recebe a lista de nomes(irmaos) para percorrer a lista toda e imprimi-lá.
        for (Pessoa p : irmaos) {
            System.out.println(p);
        }
        System.out.println("************************");

        //lista chamando o método forEach passando como parâmetro o método de referência ou uma lambda.
        irmaos.forEach(i -> System.out.println(i));
        irmaos.forEach(System.out::println);
        System.out.println("************************");

        //cria um fluxo de objetos Pessoa diretamente não sendo necessário criar uma coleção separada.
        Stream<Pessoa> nomes = Stream.of(
            new Pessoa("João", 32),
            new Pessoa("Maria", 30),
            new Pessoa("Marcos", 35)
        );
        //forEach passando como parâmetro o método de referência ou uma lambda.
        nomes.forEach(n -> System.out.println(n));
        nomes.forEach(System.out::println);
    }
}
