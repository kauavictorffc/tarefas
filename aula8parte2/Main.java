public class Main {
    public static void main(String[] args) {
        // Cria e inicia 5 threads para simular o acesso ao banco de dados
        for (int i = 1; i <= 5; i++) {
            Thread thread = new DatabaseAccessThread();
            thread.setName("Thread-" + i);
            thread.start();
        }
    }
}
