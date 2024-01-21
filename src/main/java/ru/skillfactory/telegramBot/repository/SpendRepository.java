package ru.skillfactory.telegramBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.telegramBot.entity.Spend;
@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
