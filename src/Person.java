public class Person {
    private String name;

    public Person(String name){
     this.setName(name);
    }
    public static void main(String[] args){

        Person charlie = new Person("Charlie");
        Person hung = new Person("Hung");

        charlie.sayHello();
        System.out.print(charlie.getName() + "\n");

        hung.sayHello();
        System.out.print(hung.getName() + "\n");




    }


    public String getName(){
       return this.name;
    }

    public void setName (String name){
       this.name = name;
    }

    public void sayHello(){
        System.out.print("Hello, my name is ");
    }

}
