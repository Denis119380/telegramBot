package ru.skillfactory.telegramBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.telegramBot.entity.Income;
@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
