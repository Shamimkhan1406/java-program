public class conditionals {
    public static void main(String[] args) {
        int age = 99;
        if(age>18)
        {
            System.out.println("yes you can drive");
        }
        else
        {
            System.out.println("no : you can't drive");
        }
        switch(age)
        {
            case 5 -> System.out.println("enjoy");
            default -> System.out.println("study");
        }
    }
}
