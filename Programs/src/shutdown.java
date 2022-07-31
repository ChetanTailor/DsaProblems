import java.io.IOException;

public class shutdown {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("shutdown -s -t "+5);

    }
}
