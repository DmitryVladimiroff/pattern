
public class Gustomer {
    private long id;
    private String name;
    private String email;
    private String address;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private Gustomer() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Gustomer gustomer = new Gustomer();

        private Builder() {

        }

        public Builder id(long id) {
            gustomer.id = id;
            return this;
        }

        public Builder name(String name) {
            gustomer.name = name;
            return this;

        }

        public Builder email(String email) {
            gustomer.email = email;
            return this;

        }

        public Builder address(String address) {
            gustomer.address = address;
            return this;

        }

        public Gustomer build() {
            return gustomer;
        }
    }
}
