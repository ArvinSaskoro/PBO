public class ListAkun {
    private static Interface[] users = {
        new adminlmpl("arvin", "arvin123"),
        new adminlmpl("daus", "daus123"),
        new adminlmpl("saban", "saban123")
    };
    
    public static Interface[] getUsers() {
        return users;
    }
    
    public static boolean authenticate(String username, String password) {
        for (Interface user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
