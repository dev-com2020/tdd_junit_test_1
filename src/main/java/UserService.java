public class UserService {
        private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean isUserRegistered(String username) {
        return userRepository.userExists(username);
    }
}
