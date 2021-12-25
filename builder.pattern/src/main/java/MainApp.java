public class MainApp {
    public MainApp(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {
        final Gustomer gustomer = Gustomer.builder()
                .id(46890)
                .name("Дмитрий")
                .email("dmitry@yandex.ru")
                .build();
        System.out.println(gustomer);
    }

    private final long id;
    private final String name;
    private final String email;
}
