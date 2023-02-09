import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PasswortTest {

    Passwort passwordOne;

    @BeforeEach
    void setUp() {
        passwordOne = new Passwort("12345678");
    }

    @Test
    void firstTestPassword() {
        Assertions.assertTrue((passwordOne.passwortCheck()));
    }


}