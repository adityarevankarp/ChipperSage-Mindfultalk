package com.chipperSage.chipperSage.Repository;

import com.chipperSage.chipperSage.Model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository<Stage, Integer> {
}
