package clinic.creationalDP.builderDP;

public class BankAccountBuilder
{
    public static void main(String[] args)
    {
        Builder builder = new Builder("Mahdi", "2932433234");
        builder.withEmail("iz.hatami@gmail.com")
                .wantNewsletter(true);
    }

    public static class Builder
    {
        private String name;
        private String accountName;
        private String email;
        private boolean newsletter;

        public Builder(String name, String accountName)
        {
            this.name = name;
            this.accountName = accountName;
        }

        public Builder withEmail(String email)
        {
            this.email = email;
            return this;
        }


        public Builder wantNewsletter(boolean newsletter)
        {
            this.newsletter = newsletter;
            return this;
        }
    }
}
