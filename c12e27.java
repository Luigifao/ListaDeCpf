package Exerci_MOD3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class c12e27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> Enderec = new ArrayList<String>(); // Declaração de uma lista dinâmica de dados (String)
        List<String> cpf = new ArrayList<String>();
        String cpfTeste="", enderecTeste="",cpfProcura="";
        int posProcura=-1;
        do{
            System.out.print("Digite seu CPF: "); // Entrada de dados para a lista CPF
            cpfTeste = teclado.nextLine();
            if (cpfTeste.equalsIgnoreCase("0")){ // Teste para uma flag fictícia 
                break;
            }
            cpf.add(cpfTeste);
            System.out.print("Digite seu endereço: "); // Entrada de dados para a lista endereço
            enderecTeste = teclado.nextLine();
            Enderec.add(enderecTeste);
        }while(!cpfTeste.equalsIgnoreCase("0"));
        System.out.println("Digite um CPF qualquer para ser pesquisado na lista: "); // Solicito ao usuário o CPF a ser pesquisado 
        cpfProcura=teclado.nextLine();
        posProcura = cpf.indexOf(cpfProcura); // com o valor da procura já inicializado nas variáveis, eu procuro o CPF que o usuário pediu
        if(posProcura==-1){ // Oque fazer caso o CPF não seja encontrado na lista dinâmica 
            System.out.println("CPF não encontrado!");
            System.out.println("Deseja adiciona-lo a lista?(S/n) "); // Pergunto se o usuário quer adicionar o CPF digitado a lista de dados 
            String resposta=teclado.nextLine();
            if(resposta.equalsIgnoreCase("S")){
                cpf.add(cpfProcura);  // Se o usuário dizer que sim eu adiciono o novo CPF a lista 
                System.out.println("Digite um novo endereço: ");
                String novoEnd=teclado.nextLine();  // Como consequencia e para a lista ficar ordenada eu peço para o usuário digitar um novo endereço que será adicionado a lista 
                Enderec.add(novoEnd);
            }
            else{System.out.println("Você quem sabe!");} // Caso o usuário não queira adicionar o CPF a lista 

            
            
        }
        else {  // Sequencia de comandos caso o CPF seja encontrado na lista de dados 
            System.out.println("Você quer alterar o endereço ou excluir o CPF/Endereço?(A/E) ");  // Pergunto se o usuário deseja alterar o cpf ou excluir os dois da lista 
            String repostaA_E=teclado.nextLine(); 
            if (repostaA_E.equalsIgnoreCase("A")){
                System.out.println("Digite um novo endereço: ");
                String enderecNovo=teclado.nextLine();
                Enderec.set(posProcura, enderecNovo);
            }
            else {
            System.out.println("Você quer excluir o endereço ou o cpf?(E/C)"); // Se o usuário quiser excluir algo eu pergunto oque ele deseja excluir e o excluo
            String respostaE_C=teclado.nextLine();
            if (respostaE_C.equalsIgnoreCase("E")){
                Enderec.remove(posProcura);
                System.out.println("Seu endereço foi removido! ");
            }
            else if(respostaE_C.equalsIgnoreCase("C")){
                cpf.remove(posProcura);
                System.out.println("Seu CPF foi removido! ");
            }
            }
        }
        for (int aux=0;aux<cpf.size()-1;aux++){  // Impressão da lista dinamica 
        System.out.println("CPF = "+cpf.get(aux)+" Endereço = "+Enderec.get(aux));
        }
        teclado.close();
         


    }
}
