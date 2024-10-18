package repository;

import entity.Invocation;
import org.springframework.stereotype.Repository;

@Repository
public interface InvocationRepository extends JpaRepository<Invocation, Integer> {
}
