class adminlmpl implements Interface {
    private String username;
    private String password;
    
    public adminlmpl(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
