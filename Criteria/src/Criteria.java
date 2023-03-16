import java.util.List;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
public class Criteria {
    
    // Criação de um root
    Root<objeto> root = createRoot(Class.class); 

    /* 
     * Criar um root significa criar uma consulta raiz, ou seja,
     * definir onde será consultado primeiro no banco de dados
     */

    //executar um join de uma classe em outra
    Join<objetoDePartida, objetoDeEntrada> NomeDoJoin = nomeRoot.Join("nome do atributo", JoinType.tipodejoin)
    /*
     * entrando em uma tabela a partir da raiz(root) utilizando o join que representa
     * a intersecção entre os atributos de cada tabela(inner)
     */
    
    //executar um segundo join a partir do objetoDeEntrada anterior
    Join<objetoDePartida, objetoDeEntrada> NovoNomeDoJoin = NomeDoJoin.Join("nome do atributo", JoinType.tipodejoin)

    /*
     * Nesse estilo de join utiliza-se a tabela do join anterior para entrar em uma 
     * nova tabela 
     */

}
