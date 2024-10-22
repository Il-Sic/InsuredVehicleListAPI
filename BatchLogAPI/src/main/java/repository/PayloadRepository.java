package repository;

import entity.PayloadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayloadRepository extends JpaRepository<PayloadEntity, Long>
{
}

