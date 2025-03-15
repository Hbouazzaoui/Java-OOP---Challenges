public class Main {
    public static void main(String[] args) {

        //2. Constructor Challenge
     Student student = new Student(2,"Hamouda", "A");
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.grade);


        // 3. Encapsulation (Getters & Setters)
        BankAccount bankAccount = new BankAccount("12345678",1221);
        System.out.println("Initial Balance: "+ bankAccount.getBalance());

        bankAccount.setBalance(1500);
        System.out.println("update Balance: "+bankAccount.getBalance());

        bankAccount.setBalance(-500);
        System.out.println("Balance after invalid update: " + bankAccount.getBalance());


        //5. Method Overloading
        Calculator calculator = new Calculator();
        int res = calculator.Add(6 ,7);
        System.out.println("som of integer :"+ res);

        double res1 = calculator.Add(3.6 ,2.8);
        System.out.println("som of double :"+ res1);
    }
}