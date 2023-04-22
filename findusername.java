public class findusername {
    static String username(String email){
        int a=email.indexOf('@');
        String name=email.substring(0,a);
        return name;
    }
    public static void main(String[] args) {
        String email="utkarshverma689@gmail.com";
        String z=username(email);
        System.out.println("User name is : "+z);

    }
}
