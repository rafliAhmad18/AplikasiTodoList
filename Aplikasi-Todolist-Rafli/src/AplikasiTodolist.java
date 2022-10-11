/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class AplikasiTodolist {

    public static String[]model = new String[10];
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testShowTodoList();
    }
    
    public static void showTodoList(){
        for(var i = 0; i<model.length;i++){
            var todo = model [i];
            var no = i+1;
            
            if (todo!= null){
                System.out.println(no+"."+todo);
            }
        }
    }
    public static void testShowTodoList(){
        ShowTodoList();
    }
    
    public static void addTodoList(){
       
    }
    
    public static void removeTodoLidt(){
        
    }
    
    public static void viewShowTodoList(){
        
    }
    
    public static void viewAddTodoList(){
        
    }
    
    public static void viewRemoveList(){
        
    }
    
    public static void testshowTodoList(){
        for(var i = 0; i<model.length;i++){
            var todo = model [i];
            var no = i+1;
            
            if (todo!= null){
                System.out.println(no+"."+todo);
            }
        }
    }

    private static void ShowTodoList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
