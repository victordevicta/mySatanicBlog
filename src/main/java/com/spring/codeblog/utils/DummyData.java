package com.spring.codeblog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.reposiroty.CodeblogRepository;

//import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Victor de Victa");
        post1.setData(LocalDate.now());
        post1.setTitulo("Belzebu, O Senhor das Moscas");
        post1.setTexto("Em 1589, o teólogo e bispo alemão Peter Binsfield associou cada demônio a um pecado. Este aqui causaria a gula. Sua imagem veio do deus da fertilidade Baal, idolatrado pelos cananeus.");

        Post post2 = new Post();
        post2.setAutor("Victor de Victa");
        post2.setData(LocalDate.now());
        post2.setTitulo("Asmodeus, O Rei Esquecido de Sodoma");
        post2.setTexto("É um espírito do mal cuja origem, na verdade, remete a uma religião persa chamada zoroastrismo. Ele foi absorvido pelo judaísmo, que o associa ao rei de Sodoma.");

        Post post3 = new Post();
        post3.setAutor("Victor de Victa");
        post3.setData(LocalDate.now());
        post3.setTitulo("Mammon, O Ouro dos Tolos");
        post3.setTexto("O nome é aramaico e significa riqueza. Não por acaso, Binsfield o remete à avareza. Aparece em dois Evangelhos, de Lucas e Mateus. Neste último, é citado no versículo: Você não pode servir a Deus e Mamon. O que também é traduzido, algumas vezes, como: Você não pode servir à Deus e ao dinheiro.");

        Post post4 = new Post();
        post4.setAutor("Victor de Victa");
        post4.setData(LocalDate.now());
        post4.setTitulo("Azazel, A Cólera");
        post4.setTexto("Binsfield dizia que esse era o líder de um grupo de anjos caídos que faziam sexo com mulheres mortais. Foi ele quem teria ensinado aos homens como fabricar armas de guerra – por isso, está ligado à ira.");

        Post post5 = new Post();
        post5.setAutor("Victor de Victa");
        post5.setData(LocalDate.now());
        post5.setTitulo("Leviatã, A Besta Ávida");
        post5.setTexto("Também um ex-serafim, é um dos demônios mais poderosos, responsável por fazer os homens tornarem-se hereges. Habita o fundo do mar, é mencionado na Bíblia e tem várias aparências: dragão marinho, serpente, baleia e até crocodilo.");

        Post post6 = new Post();
        post6.setAutor("Victor de Victa");
        post6.setData(LocalDate.now());
        post6.setTitulo("Belfegor, A Acídia");
        post6.setTexto("Extraído da mitologia assíria, Belfegor, também conhecido como O Senhor do Fogo teria uma aparência atlética, grande estatura e chifres de carneiro. Seus inventos engenhosos trariam riqueza fácil aos homens, tornando-os vítimas da preguiça.");

        Post post7 = new Post();
        post7.setAutor("Victor de Victa");
        post7.setData(LocalDate.now());
        post7.setTitulo("Lúcifer, A Estrela da Manhã");
        post7.setTexto("Para Binsfield, Lúcifer era o orgulho, já que foi sua soberba perante Deus que causou sua desgraça. Segundo Michaelis, ele seria também o líder da primeira esfera do inferno, reservada a ex-querubins, serafins e arcanjos (Belzebu seria seu braço direito e segundo em comando.");

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        postList.add(post6);
        postList.add(post7);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}