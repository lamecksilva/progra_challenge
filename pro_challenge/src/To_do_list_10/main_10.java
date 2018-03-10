package To_do_list_10;       // Informando qual pacote o programa está.
import java.util.Scanner;       // Importando a biblioteca do Scanner.

public class main_10 {      // Iniciando a classe do codigo principal do programa 10 da lista.
    public static void main(String[] args) {    // Iniciando a main.
        int escolha = menu();       // Declarando a variável escolha que é resultado do que a funcao menu retorna.
        System.out.println("");     // Um sout vazio.
        switch (escolha) {      // Iniciando switch.
            case 1:     // Caso a função retorne o valor 1, irá mostrar na tela a lista.
                System.out.println("Mostrando lista...");
            break;
            
            case 2:    // Caso a função retorne 2, o programa irá encerrar sua execução automaticamente.
                System.out.println("Encerrando programa...");
                System.exit(0);   // Função para encerrar programas em java.
            break;
            
            default:     // Caso o caboclo não digite nada condizente com as opções do menu, 
                                  // Irá aparecer uma mensagem de erro e o programa encerrará.
                System.out.println("Opção errada amigo.\nEncerrando programa...");
        }
    }
    
    public static int menu() {          // Função criada para mostrar o menu ao usuário e retornar o valor da resposta.
        Scanner input = new Scanner(System.in);     // Criando uma intância da classe Scanner.
        
        System.out.println("============= To do List ==============");      // Firulas.
        System.out.println("=======Gerenciador de coisas para fazer=======");       // Mais Firulas.
        System.out.println("[ 1 ] - Mostrar Lista");        // Inacreditável como tem que deixar bonitiho.
        System.out.println("[ 2 ] - Encerrar e Sair");         // Mesmo nao tendo GUI, tem que ficar agradável.
        int menu = input.nextInt();         // A variável menu, irá receber um valor inteiro do usuário.
        return menu;    // E ao final do código, irá retornar o valor da resposta.
    }
}

