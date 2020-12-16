class helloWorld {
    //global variables
    public static int a;
    public static int b;
    //local variables without initialization
    //this will result in an error
    public void Age(){
       // int age;
        //initialize local variable
        int age = 5;
        age = age + 1;
        System.out.println("I am " + age + " years old!");
    }



    public static void main(String[] args) {
        helloWorld hello = new helloWorld();
        hello.Age();

        //illegal field names
        //int 1legal;
        //String 7name;

        //legal field names un-initialize
        //int even;
        //String name;
        //System.out.println(even); //gives errors over here
    }
}