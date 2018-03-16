package To_do_list_10;
import java.io.PrintStream;
import java.util.Scanner;


public class main_10 {
    public static String[] list = new String[50];
    public static Scanner input = new Scanner(System.in);
    public static int option, optionList;
    
    public static void main(String[] args){
        
        do {
            option = showMenu();
            
            if (option == 1) {
                showList();    
            }
        } while(option != 2);
    }
    
    public static int showMenu(){
        int opt;
        System.out.println("\tTo Do List");
        System.out.println("[ 1 ] - Show List");
        System.out.println("[ 2 ] - Exit\n");
        System.out.print("Option: ");
        opt = input.nextInt();
        
        return opt;
    }
    
    public static void showList(){
        for(int contador = 0; contador != 50; contador++) {
            if (list[contador] != null) {
                System.out.printf("[ %d] - %s\n",(contador + 1),(list[contador]));
            }
        }
        System.out.printf("\n");
        System.out.printf("[ 1 ] - Add Item \t [ 2 ] - Modify Item \t [ 3 ] - Delete Item \t [ 4 ] - Exit \n");
        optionList = input.nextInt();
        
        switch (optionList) {
            case 1: 
                addItem();
                break;
                
            case 2: 
                modifyItem();
                break;
                
            case 3: 
                deleteItem();
                break;
                
            default:
                System.out.println("kys my cok ur dank");
        }
    }
    
    public static void addItem(){
        
        char add = 'y';
        
        for (int contador = 0; contador != 50; contador++){
            
            if(list[contador] == null && add == 'y'){
                
                System.out.printf("\n Add Item: ");
                list[contador] = input.nextLine();
                
            } 
            else {
                break;
            }
            
            System.out.println("\n Add more? [ y or n]: ");
            add = input.next().charAt(0);
            
        }
        
    }
    
    public static void modifyItem(){
        
    }
    
    public static void deleteItem(){
        
    }
    
    }