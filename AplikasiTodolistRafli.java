/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.todolist.rafli;

/**
 *
 * @author hp
 */
public class AplikasiTodolistRafli {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testViewShowTodoList();
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
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }
    
    public static void addTodoList(String todo){
        var isFull = true;
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                isFull = false;
                break;    
            }
        }
        
        if (isFull){
            var temp = model;
            model = new String [model.length * 2];
            
            for (int i = 0; i < temp.length; i++){
                model[i] = temp [i];
            }
        }
        
        // tambahkan ke posisi yang null
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;    
            }
        }
    }
    
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++){
            addTodoList("Contoh Todo Ke." + i);
        }
        
        showTodoList();
    }
    
    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
          return false;
        } else if (model[number - 1] == null){
          return false;
        } else {
            for(int i = (number - 1); i < model.length; i++){
            if (i == (model.length - 1)){
                model[i] = null;
            } else{
                model[i] = model[i +1];
            }
        }
        return true;
    }
  } 
    
    public static void testRemoveTodolist() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        
        var result = removeTodoList(20);
        System.out.println(result);
        
        result = removeTodoList(7);
        System.out.println(result);
        
        result = removeTodoList(2);
        System.out.println(result);
        
        showTodoList();
    }
    
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    
    public static void testInput(){
        var name = input ("Nama");
        System.out.println("Hi " + name);
        
        var channel = input ("Channel");
        System.out.println(channel);
    }
    public static void viewShowTodoList(){
        while (true){
            showTodoList();
        
            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
        
            var input = input("Pilih");
             if (input.equals("1")){
                viewAddTodoList();
             } else if (input.equals("2")){
                 viewRemoveTodoList();
             } else if (input.equals("x")){
                break;
             } else{
                 System.out.println("Pilihan tidak diemnegerti");
             }
        }
        
    }
    
    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");
        
        var todo = input("Todo (x Jika Batal)");
        
        if (todo.equals("x")){
            
        } else {
            addTodoList(todo);
        }
    }
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        
        viewAddTodoList();
        
        showTodoList();    
    }
    
    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");
        
        var number = input("Nomor yang Dihapus (x Jika batal)");
        
        if (number.equals("x")) {
            
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }
    
    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        
        showTodoList();
        
        
        
        showTodoList();
    }  
}
