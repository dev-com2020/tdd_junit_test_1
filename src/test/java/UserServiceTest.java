import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }

    @Test
    void testIsUserRegistered_WhenUserExists(){
        when(userRepository.userExists("john")).thenReturn(true);

        boolean result = userService.isUserRegistered("john");
        assertTrue(result,"User powinien być zarejestrowany");
        verify(userRepository).userExists("john");
    }
    @Test
    void testIsUserRegistered_WhenUserDoesNotExists(){
        when(userRepository.userExists("alice")).thenReturn(false);

        boolean result = userService.isUserRegistered("alice");
        assertFalse(result,"User nie powinien być zarejestrowany");
        verify(userRepository).userExists("alice");
    }

}
