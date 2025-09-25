package com.trackmystuff.trackmy_stuff_api.repositories;

import com.trackmystuff.trackmy_stuff_api.models.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
}