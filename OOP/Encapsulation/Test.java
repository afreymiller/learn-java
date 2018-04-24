/* Example of encapsulation (information hiding) */

/* Good post on Abstraction vs. Encapsulation:
https://stackoverflow.com/questions/11965929/abstraction-vs-encapsulation-in-java */

class Student{  
    
    private String name;

    public Student(String name) {
        this.name = name;
    }
   
    public String getName(){  
        return name;  
    }  

    public void setName(String name){  
        this.name=name;
    } 
} 

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Hello");
        System.out.println(s.getName());
    } 
} 