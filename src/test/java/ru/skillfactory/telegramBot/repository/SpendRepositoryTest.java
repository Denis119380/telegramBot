package ru.skillfactory.telegramBot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactory.telegramBot.entity.Spend;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class SpendRepositoryTest {

    @Autowired
    private SpendRepository spendRepository;

    @Test
    public void testDataScripts() {
        Optional<Spend> spendOne = spendRepository.findById(1L);
        Optional<Spend> spendTwo = spendRepository.findById(23L);
        assertTrue(spendOne.isEmpty());
        assertEquals(Long.valueOf(23), spendTwo.get().getChatId());
    }
}