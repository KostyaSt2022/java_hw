import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

public class task_41 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();   
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);  
        
        reverseList(list);
    }
    
    private static LinkedList<Integer> reverseList ( LinkedList<Integer> list){    
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            reverseList.add(list.size()-i);
        }   
        System.out.println(reverseList);
        return reverseList;
    }
}