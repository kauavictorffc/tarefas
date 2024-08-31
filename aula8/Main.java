import java.util.Random;
import java.util.Scanner;

class Login {
    // Instância única da classe (Singleton)
    private static Login instance;

    // Credenciais do usuário
    private String username;
    private String password;

    // Construtor privado para impedir múltiplas instâncias
    private Login() {}

    // Método para obter a única instância da classe
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    // Método para configurar as credenciais
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Método para gerar CAPTCHA aleatório
    private String generateCaptcha(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            captcha.append(characters.charAt(random.nextInt(characters.length())));
        }
        return captcha.toString();
    }

    // Método para realizar o login
    public String login(String inputUsername, String inputPassword) {
        if (this.username == null || this.password == null) {
            return "Nenhum usuário registrado. Por favor, configure as credenciais primeiro.";
        }

        if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
            String captcha = generateCaptcha(6);
            System.out.println("Por favor, digite o seguinte CAPTCHA: " + captcha);
            Scanner scanner = new Scanner(System.in);
            String userCaptcha = scanner.nextLine();
            if (userCaptcha.equals(captcha)) {
                return "Login bem-sucedido!";
            } else {
                return "Falha na verificação do CAPTCHA. Por favor, tente novamente.";
            }
        } else {
            return "Nome de usuário ou senha incorretos. Por favor, tente novamente.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Obtém a instância única do sistema de login
        Login loginSystem = Login.getInstance();
        
        // Configura as credenciais
        loginSystem.setCredentials("user123", "securepassword");
        
        // Tentativa de login
        String result = loginSystem.login("user123", "securepassword");
        System.out.println(result);
    }
}
