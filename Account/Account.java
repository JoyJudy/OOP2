package Class_Challenges.Account;

abstract public class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource myData){
        this.myData = myData;
        //executes the operation on the data source
        myData.execute();
    }
}

class Admin extends Account{
    //A private string specified only with the Admin
    private String AuthPassword;

    //Constructor to initialize Admin
    public Admin(int id, String name, String password){
        this.id = id;
        this.name = name;
        AuthPassword = password;
    }
}

interface DataSource{
    public void execute();
}

class Delete implements DataSource{
    @Override
    public void execute(){
        System.out.println("Data has been deleted.");
    }
}

class MainApplication{
    public static void main(String[] args){
        //two objects are created; one for the admin and another for the user
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");
        User curUser = new User(4455, "John");
        curAdmin.performOperation(new Update()); //Admin Updates the data
        curUser.performOperation(new View()); //User can view the data
    }
}

class Update implements DataSource{
    @Override
    public void execute(){
        System.out.println("Data has been updated successfully!");
    }
}

class User extends Account{
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class View implements DataSource{
    @Override
    public void execute(){
        System.out.println("Some data to be displayed.");
    }
}
