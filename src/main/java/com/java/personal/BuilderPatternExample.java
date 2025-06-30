package com.java.personal;

public class BuilderPatternExample {
    //Builder patter using Java 17 records feature
    public record User(String name, String email) {
        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String name;
            private String email;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder email(String email) {
                this.email = email;
                return this;
            }

            public User build() {
                return new User(this.name, this.email);
            }

        }
    }

    public static void main(String[] args) {
        var user = User.builder().name("user 1").email("user@test.com").build();
        System.out.printf("User 1 information: %s%n",user.toString());
    }

}