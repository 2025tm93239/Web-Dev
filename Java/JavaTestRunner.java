public class JavaTestRunner {
    public static void main(String[] args) {
        UserService service = new UserService();

        User alice = service.createUser("Alice");
        if (!"Alice".equals(alice.getName())) {
            throw new RuntimeException("createUser test failed for Alice");
        }

        User bob = service.createUser("Bob");
        if (!"Bob".equals(bob.getName())) {
            throw new RuntimeException("createUser test failed for Bob");
        }

        if (!service.isValidName("Web-Dev")) {
            throw new RuntimeException("isValidName should be true");
        }
        if (service.isValidName("  ")) {
            throw new RuntimeException("isValidName should be false for blank");
        }

        System.out.println("JavaTestRunner v1.0.4: 4 tests passed");
    }
}
