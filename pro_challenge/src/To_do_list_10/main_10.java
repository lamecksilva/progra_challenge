/*

@author: Lameck
@description: Apenas um programa funcional de uma lista de afazeres temporária( temporária pois após o encerramento do programa, os dados são perdidos).
*/
package To_do_list_10;
import java.util.Scanner;
import java.util.ArrayList;

public class main_10 {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> tdList = new ArrayList<String>();
    public static int option,optionM;
    
    public static void main(String[] args){
        do{
            showMainMenu();
            calcOption(option);
            
        } while (option != 2);
        
    }
    
    public static void showMainMenu(){                                              // Function to show the main menu of program
        System.out.println("\n \t *** To do List - Menu ***");
        System.out.println("( 1 )- Show List");
        System.out.println("( 2 ) - Exit");
        
        System.out.printf("\n[ Option ] - ");
        option = input.nextInt();
    }
    
    public static void calcOption(int option) {                                     // Function to calc the option 
        switch (option){
            case 1:
                showList();
                break;
                
            case 2:
                break;
        }
    }
    
    public static void showList(){
        System.out.println("\n \t ### To do List - List ###");
        for (int counter = 0; counter != tdList.size(); counter++){
            System.out.printf("[ %d ] - %s\n",(counter+1),tdList.get(counter));
        }
        
        System.out.printf("\n ( 1 ) - Add new item");
        System.out.printf("\t ( 2 ) - Modify Item");
        System.out.printf("\t ( 3 ) - Remove Item");
        System.out.println("\t ( 4 ) - Exit ");
        System.out.printf("[ OPTION ] = ");
        optionM = input.nextInt();
        input.nextLine();
        
        switch (optionM) {
            case 1:
                addItem();
                break;
                
            case 2:
                modifyItem();
                break;
                
            case 3:
                removeItem();
                break;
                
            case 4:
                break;
                
        }
    }
    
    public static void addItem() {
        String temp;
            System.out.printf("ADD: ");
            
            temp = input.nextLine();
            tdList.add(tdList.size(),temp);
            
    }
    
    public static void modifyItem() {
        System.out.printf("Please, select a line: ");
        int line = input.nextInt();
        line = (line - 1);
        input.nextLine();
        
        System.out.printf("Modify for: ");
        String temp = input.nextLine();
        tdList.set(line, temp);
        System.out.printf("\n Line updated!! \n");
        
    }
    
    public static void removeItem() {
        System.out.printf("Please, select a line: ");
        int line = input.nextInt();
        line = (line -1);
        input.nextLine();
        
        tdList.remove(line);
        System.out.printf("List Updated!!\n");
    }
    
}