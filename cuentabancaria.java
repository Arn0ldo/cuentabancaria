public class cuentabancaria {
    private String name;
    private String lastname;
    private double balance;
    private String email;




    public CuentaBancaria(String name, String lastname, String balance, String email) {
        this.name = name;
        this.lastname = lastname;
        this.balance = balance;
        this.email = email;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public void deposit(double money){
        balance = balance + money;
        System.out.println("Operacion realizada con exito");
    }
    public void withdraw(double money){
        if (balance >= money){
            balance = balance - money;
            System.out.println("Operacion realizada con exito");
        }else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
