package CarleonQuiz;

import java.util.Scanner;
public class quiz {    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int acertos = 0;

    cabeçalho cabecalho1 = new cabeçalho();

    cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
    cabecalho1.Aluno = "Aluno: Carleon Junio Xavier Brasil";
    cabecalho1.Professor = "Professor: Brenno Pimenta";
    cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao";
    cabecalho1.Inicio = "Bem vindo ao quiz!";
    cabecalho1.escrevaCabecalho();


    questoes questoes1 = new questoes();
    questoes1.questoes = "1- O que as abelhas são conhecidas por fabricar?";
    questoes1.A = "A) Seiva";
    questoes1.B = "B) Algodão";
    questoes1.C = "C) Xarope";
    questoes1.D = "D) Mel ";
    questoes1.E = "E) Pimenta";
    questoes1.escrevaquestao();
    questoes1.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    String resposta = (String) sc.nextLine();
    if (questoes1.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("====================================================================== ");
    questoes questoes2 = new questoes();
    questoes2.questoes = "2- Pode tirar o cavalinho da:";
    questoes2.A = "A) Rua";
    questoes2.B = "B) Luva";
    questoes2.C = "C) Chuva";
    questoes2.D = "D) Casa";
    questoes2.E = "E) Nenhuma das Anteriores";
    questoes2.escrevaquestao();
    questoes2.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes2.iscorreta(resposta)){
        acertos = acertos+1;
    }
    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes3 = new questoes();
    questoes3.questoes = "3- De que era feito o sapatinho da Cinderela?";
    questoes3.A = "A) Couro";
    questoes3.B = "B) Cristal";
    questoes3.C = "C) Tecido";
    questoes3.D = "D) Borracha";
    questoes3.E = "E) Não tinha";
    questoes3.escrevaquestao();
    questoes3.correta = "B";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes3.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes4 = new questoes();
    questoes4.questoes = "4- De quem é a famosa frase “Penso, logo existo”?";
    questoes4.A = "A) Platão";
    questoes4.B = "B) Palhaço mcdonalds";
    questoes4.C = "C) Antonio";
    questoes4.D = "D) Sócrates";
    questoes4.E = "E) Descartes";
    questoes4.escrevaquestao();
    questoes4.correta = "E";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes4.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes5 = new questoes();
    questoes5.questoes = "5- Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?";
    questoes5.A = "A) Saci";
    questoes5.B = "B) Carleon";
    questoes5.C = "C) Boitatá";
    questoes5.D = "D) Caipora";
    questoes5.E = "E) Lobisomem";
    questoes5.escrevaquestao();
    questoes5.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes5.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes6 = new questoes();
    questoes6.questoes = "6- Em que período da pré-história o fogo foi descoberto?";
    questoes6.A = "A) Neolítico";
    questoes6.B = "B) Paleolitico";
    questoes6.C = "C) Idade dos metais";
    questoes6.D = "D) Idade média";
    questoes6.E = "E) Período da pedra polida";
    questoes6.escrevaquestao();
    questoes6.correta = "B";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes6.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes7 = new questoes();
    questoes7.questoes = "7- Qual a montanha mais alta do Brasil?";
    questoes7.A = "A) Pico Maior de Friburgo";
    questoes7.B = "B) Pico da Bandeira";
    questoes7.C = "C) Monte Roraima";
    questoes7.D = "D) Pico da neblina";
    questoes7.E = "E) Pico do Parana";
    questoes7.escrevaquestao();
    questoes7.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes7.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes8 = new questoes();
    questoes8.questoes = "8- Qual a velocidade da luz?";
    questoes8.A = "A) 30 000 000 metros por segundo (m/s)";
    questoes8.B = "B) 199 792 458 metros por segundo (m/s)";
    questoes8.C = "C) 299 792 458 metros por segundo (m/s)";
    questoes8.D = "D) 150 000 000 metros por segundo (m/s)";
    questoes8.E = "E) 300 000 000 metros por segundo (m/s)";
    questoes8.escrevaquestao();
    questoes8.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes8.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes9 = new questoes();
    questoes9.questoes = "9-  Em qual local da Ásia o português é língua oficial?";
    questoes9.A = "A) Macau";
    questoes9.B = "B) Portugal";
    questoes9.C = "C)  Moçambique";
    questoes9.D = "D) Filipinas";
    questoes9.E = "E)  Índia";
    questoes9.escrevaquestao();
    questoes9.correta = "A";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes9.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes10 = new questoes();
    questoes10.questoes = "10- Quem é o autor de “O Príncipe”?";
    questoes10.A = "A) Antoine de Saint-Exupéry";
    questoes10.B = "B) Montesquieu";
    questoes10.C = "C) Thomas Hobbes";
    questoes10.D = "D) Maquiavel";
    questoes10.E = "E) Rousseau";
    questoes10.escrevaquestao();
    questoes10.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes10.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes11 = new questoes();
    questoes11.questoes = "11- Quais destas doenças são sexualmente transmissíveis?";
    questoes11.A = "A) Gonorreia, clamídia e sífilis";
    questoes11.B = "B) Aids, tricomoníase e ebola";
    questoes11.C = "C) Chikungunya, aids e herpes genital";
    questoes11.D = "D) Botulismo, cistite e gonorreia";
    questoes11.E = "E) Hepatite B, febre tifoide e hanseníase";
    questoes11.escrevaquestao();
    questoes11.correta = "E";
    System.out.println("Digite a alternativa correta: A ");
    resposta = (String) sc.nextLine();
    if (questoes11.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes12 = new questoes();
    questoes12.questoes = "12- Qual destes países é transcontinental?";
    questoes12.A = "A) Rússia";
    questoes12.B = "B) Filipinas";
    questoes12.C = "C) Marrocos";
    questoes12.D = "D) Groenlândia";
    questoes12.E = "E) Tanzânia";
    questoes12.escrevaquestao();
    questoes12.correta = "A";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes12.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes13 = new questoes();
    questoes13.questoes = "13- Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?";
    questoes13.A = "A) Filosofia";
    questoes13.B = "B) Biologia";
    questoes13.C = "C) Mitologia";
    questoes13.D = "D) Astronomia";
    questoes13.E = "E) Marte";
    questoes13.escrevaquestao();
    questoes13.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes13.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes14 = new questoes();
    questoes14.questoes = "14- Qual o maior animal terrestre?";
    questoes14.A = "A) Baleia Azul";
    questoes14.B = "B) Dinossauro";
    questoes14.C = "C) Tubarão Branco";
    questoes14.D = "D) Elefante africano";
    questoes14.E = "E) Girafa";
    questoes14.escrevaquestao();
    questoes14.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes14.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes15 = new questoes();
    questoes15.questoes = "15- Qual a religião monoteísta que conta com o maior número de adeptos no mundo?";
    questoes15.A = "A) Judaísmo";
    questoes15.B = "B) Cristianismo";
    questoes15.C = "C) Islamismo";
    questoes15.D = "D) Zoroastrismo";
    questoes15.E = "E) Hinduísmo";
    questoes15.escrevaquestao();
    questoes15.correta = "B";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes15.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

}
}

