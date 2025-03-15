public class Main {
    public static void main(String[] args) {

        //student
     Student student = new Student(2,"Hamouda", "A");
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.grade);
        // BankAccount
        BankAccount bankAccount = new BankAccount("12345678",1221);
        System.out.println("Initial Balance: "+ bankAccount.getBalance());

        bankAccount.setBalance(1500);
        System.out.println("update Balance: "+bankAccount.getBalance());

        bankAccount.setBalance(-500);
        System.out.println("Balance after invalid update: " + bankAccount.getBalance());



    }
}