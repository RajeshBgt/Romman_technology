
 class User {
    private String firstname;
    private String secondname;
    private String username;
    private String password;

    public User(String firstname,String secondname,String username,String password)
    {
        super();
        this.firstname = firstname;
        this.secondname = secondname;
        this.username = username;
        this.password = password;

    }

    public String getFirstname() {
       return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setpassword (String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [firstname="+firstname +", secondname="+ secondname +",username="+ username +",password="+password +"]";
    }
    public static void main(String[] args) {
        User u1=new User("Mental Lakshmi", "K.H", "Mental Lak ", "123");
        System.out.println(u1.getFirstname());
        System.out.println(u1.toString());
    }

}



     
