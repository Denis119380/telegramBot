package ru.skillfactory.telegramBot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillfactory.telegramBot.repository.IncomeRepository;
import ru.skillfactory.telegramBot.repository.SpendRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FinanceServiceTest {

    @InjectMocks
    private FinanceService financeService;

    @Mock
    private IncomeRepository incomeRepository;

    @Mock
    private SpendRepository spendRepository;

    @Test
    public void testFinanceOperationIncome() {
        String amount = "100.0";
        String message = financeService.addFinanceOperation("/addincome", amount, 32L);
        Assertions.assertEquals("Доход в размере " + amount + " был успешно добавлен", message);
    }

    @Test
    public void testFinanceOperationSpend() {
        String amount = "50.0";
        String message = financeService.addFinanceOperation("/nan", amount, 32L);
        Assertions.assertEquals("Расход в размере " + amount + " был успешно добавлен", message);
    }
}