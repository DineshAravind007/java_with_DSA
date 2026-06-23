class encap{
    private String name;
    void setname(String s){
        name = s;
    }
    String getname(){
        return name;
    }
}
public class getset {
    public static void main(String[] args) {
        encap e = new encap();
        e.setname("Dinesh");
        System.out.println(e.getname());
    }
    
}
