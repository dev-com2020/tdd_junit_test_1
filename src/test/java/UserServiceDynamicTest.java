import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceDynamicTest {

    @Mock
    private UserRepository userRepository;
    private UserService userService;

    void setup() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }

    @TestFactory
    Stream<DynamicTest> testUserDynamics() {
        setup();
        return Stream.of(
                new TestCase("john", true),
                new TestCase("alice", false),
                new TestCase("bob", true)
        ).map(tc -> DynamicTest.dynamicTest("Sprawdzanie usera: " + tc.username,
                () -> {
                    when(userRepository.userExists(tc.username)).thenReturn(tc.expected);
                    boolean result = userService.isUserRegistered(tc.username);
                    assertEquals(tc.expected, result);
                    verify(userRepository).userExists(tc.username);
                }));
    }

    static class TestCase {
        String username;
        boolean expected;

        TestCase(String username, boolean expected) {
            this.username = username;
            this.expected = expected;
        }
    }
}

